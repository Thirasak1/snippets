/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:SuppressLint("RestrictedApi") // Required for SNAPSHOT build. Remove after the release.

package com.example.xr.arcore

import android.annotation.SuppressLint
import androidx.xr.runtime.PlaneTrackingMode
import androidx.xr.runtime.Session
import androidx.xr.runtime.SessionConfigureConfigurationNotSupported
import androidx.xr.runtime.SessionConfigurePermissionsNotGranted
import androidx.xr.runtime.SessionConfigureSuccess

fun configurePlaneTracking(session: Session) {
    // [START androidxr_arcore_planetracking_configure]
    val newConfig = session.config.copy(
        planeTracking = PlaneTrackingMode.HorizontalAndVertical,
    )
    when (val result = session.configure(newConfig)) {
        is SessionConfigureConfigurationNotSupported ->
            TODO(/* Some combinations of configurations are not valid. Handle this failure case.*/)
        is SessionConfigurePermissionsNotGranted ->
            TODO(/* The required permissions in result.permissions have not been granted. */)
        is SessionConfigureSuccess -> TODO(/* Success! */)
    }
    // [END androidxr_arcore_planetracking_configure]
}

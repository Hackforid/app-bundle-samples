/*
 * Copyright 2018 Google LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.samples.dynamicfeatures.ondemand;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.google.android.samples.dynamicfeatures.BaseSplitActivity;
import com.google.android.samples.dynamicfeatures.ondemand.java.R;

/** A simple activity displaying text written in Java. */
public class JavaSampleActivity extends BaseSplitActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_java);
        getWindow().getDecorView().setOnClickListener(v -> Toast.makeText(JavaSampleActivity.this, "test lambda", Toast.LENGTH_SHORT).show());
    }

}

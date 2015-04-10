/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kiwiandroiddev.example.quickreturntoolbar;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Demo activity for a quick returning toolbar.
 *
 * Based on Roman Nurik's Quick Return pattern implementation which can be found here
 * (scrolltricks sub-project):
 * https://code.google.com/p/romannurik-code/
 */
public class MainActivity extends FragmentActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        toolbar.setTitle("App Title");
        toolbar.setSubtitle("Subtitle");

        ObservableScrollView mObservableScrollView = (ObservableScrollView) findViewById(R.id.scroll_view);
        View placeholderView = findViewById(R.id.placeholder);

        QuickReturnHandler.setup(toolbar, placeholderView, mObservableScrollView);
    }
}

/*
 * Copyright 2012 Decebal Suiu
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with
 * the License. You may obtain a copy of the License in the LICENSE file, or at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package ro.fortsoft.wicket.dashboard.widget.justgage;

import ro.fortsoft.wicket.dashboard.WidgetDescriptor;

/**
 * @author Decebal Suiu
 */
public class JustGageWidgetDescriptor implements WidgetDescriptor {

	private static final long serialVersionUID = 1L;

	public String getDescription() {
		return "A simple gauge widget. See http://justgage.com/";
	}

	public String getName() {
		return "JustGage";
	}

	public String getProvider() {
		return "Decebal Suiu";
	}

	public String getWidgetClassName() {
		return JustGageWidget.class.getName();
	}

	@Override
	public String getTypeName() {
		return "widget.justgage";
	}

}

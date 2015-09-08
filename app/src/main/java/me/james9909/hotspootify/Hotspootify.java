package me.james9909.hotspootify;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;

/**
 * Created by James on 8/30/15.
 */
public class Hotspootify implements IXposedHookInitPackageResources {

    String packageName = "";
    @Override
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam initPackageResourcesParam) throws Throwable {

        packageName = initPackageResourcesParam.packageName;

        if (packageName.equals("com.android.systemui")) {
            initPackageResourcesParam.res.setReplacement("com.android.systemui", "string", "quick_settings_hotspot_label", "Hotspoot");
        } else if (packageName.equals("com.android.settings")) {
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "wifi_tether_checkbox_text", "Portable Wi-Fi hotspoot");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "wifi_tether_enabled_subtext", "Portable hotspoot %1$s active");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "wifi_tether_failed_subtext", "Portable Wi-Fi hotspoot error");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "wifi_tether_configure_ap_text", "Set up Wi-Fi hotspoot");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "wifi_tether_configure_subtext", "%1$s %2$s portable Wi-Fi hotspoot");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "wifi_tether_configure_ssid_default", "AndroidHotspoot");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "tether_settings_title_wifi", "Portable hotspoot");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "tether_settings_title_all", "Tethering & portable hotspoot");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "data_usage_menu_metered", "Mobile hotspoots");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "data_usage_metered_title", "Mobile hotspoots");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "data_usage_metered_body", "Select the Wi-Fi networks which are mobile hotspoots.  Apps can be restricted from using these networks when in the background.  Apps may also warn before using these networks for large downloads.");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "data_usage_metered_wifi_disabled", "To select mobile hotspoots, turn Wi-Fi on.");
            initPackageResourcesParam.res.setReplacement("com.android.settings", "string", "wifi_tether_checkbox_text", "Portable Wi-Fi hotspoot");
        }
    }
}

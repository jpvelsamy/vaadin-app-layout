package com.github.appreciated.app.layout.builder;

import com.github.appreciated.app.layout.drawer.*;

public enum DrawerVariant {
    LEFT(LeftNavigationDrawer.class),
    LEFT_RESPONSIVE(LeftNavigationDrawerResponsive.class),
    LEFT_OVERLAY(LeftNavigationDrawerOverlay.class),
    LEFT_RESPONSIVE_OVERLAY(LeftNavigationDrawerResponsiveOverlay.class),
    LEFT_RESPONSIVE_OVERLAY_NO_APP_BAR(LeftNavigationDrawerResponsiveOverlayNoAppBar.class),
    LEFT_RESPONSIVE_SMALL(LeftNavigationDrawerResponsiveSmall.class),
    LEFT_RESPONSIVE_SMALL_NO_APP_BAR(LeftNavigationDrawerResponsiveSmallNoAppBar.class);

    private Class<? extends AbstractNavigationDrawer> aClass;

    DrawerVariant(Class<? extends AbstractNavigationDrawer> aClass) {
        this.aClass = aClass;
    }

    public AbstractNavigationDrawer getInstance() {
        try {
            return aClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}

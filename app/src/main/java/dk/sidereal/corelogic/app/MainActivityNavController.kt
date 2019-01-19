package dk.sidereal.corelogic.app

import dk.sidereal.corelogic.nav.CoreNavHostFragment
import dk.sidereal.corelogic.nav.NavActivityController
import dk.sidereal.corelogic.platform.lifecycle.CoreActivity

class MainActivityNavController(coreActivity: CoreActivity) : NavActivityController(coreActivity) {

    override fun getNavHostFragment(): CoreNavHostFragment = CoreNavHostFragment.create(R.navigation.nav_main)

    override fun getBottomNavigationMenuId(): Int? {
        return R.menu.menu_main
    }

    override fun getNavigationMenuId(): Int? {
        return R.menu.menu_main
    }

    override fun getStartDestinations(): List<Int> {
        return listOf(R.id.contactsFragment, R.id.infoFragment)
    }

    override fun showActionBar(): Boolean {
        return true
    }

}
package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.e16;
import p149l.ig3;
import p149l.j6f;
import p149l.jbl0;
import p149l.xyg0;
import p149l.z30;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuBuilder implements xyg0 {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private InterfaceC0078a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private MenuItemImpl mExpandedItem;
    private SparseArray<Parcelable> mFrozenViewStates;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<MenuItemImpl> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<InterfaceC0091g>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<MenuItemImpl> mItems = new ArrayList<>();
    private ArrayList<MenuItemImpl> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<MenuItemImpl> mActionItems = new ArrayList<>();
    private ArrayList<MenuItemImpl> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.MenuBuilder$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0078a {
        boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem);

        void onMenuModeChange(MenuBuilder menuBuilder);
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.MenuBuilder$b */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface InterfaceC0079b {
        /* JADX INFO: renamed from: c */
        boolean mo375c(MenuItemImpl menuItemImpl);
    }

    public MenuBuilder(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private MenuItemImpl createNewMenuItem(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new MenuItemImpl(this, i, i2, i3, i4, charSequence, i5);
    }

    private void dispatchPresenterUpdate(boolean z) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<InterfaceC0091g> weakReference : this.mPresenters) {
            InterfaceC0091g interfaceC0091g = weakReference.get();
            if (interfaceC0091g == null) {
                this.mPresenters.remove(weakReference);
            } else {
                interfaceC0091g.updateMenuView(z);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference<InterfaceC0091g> weakReference : this.mPresenters) {
            InterfaceC0091g interfaceC0091g = weakReference.get();
            if (interfaceC0091g == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = interfaceC0091g.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC0091g.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<InterfaceC0091g> weakReference : this.mPresenters) {
            InterfaceC0091g interfaceC0091g = weakReference.get();
            if (interfaceC0091g == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id = interfaceC0091g.getId();
                if (id > 0 && (parcelableOnSaveInstanceState = interfaceC0091g.onSaveInstanceState()) != null) {
                    sparseArray.put(id, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(SubMenuC0094j subMenuC0094j, InterfaceC0091g interfaceC0091g) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = interfaceC0091g != null ? interfaceC0091g.onSubMenuSelected(subMenuC0094j) : false;
        for (WeakReference<InterfaceC0091g> weakReference : this.mPresenters) {
            InterfaceC0091g interfaceC0091g2 = weakReference.get();
            if (interfaceC0091g2 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = interfaceC0091g2.onSubMenuSelected(subMenuC0094j);
            }
        }
        return zOnSubMenuSelected;
    }

    private static int findInsertIndex(ArrayList<MenuItemImpl> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).getOrdering() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int getOrdering(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i2 < iArr.length) {
                return (i & j6f.COLOR_SPACE_UNCALIBRATED) | (iArr[i2] << 16);
            }
        }
        ig3.m135964a("order does not contain a valid category.");
        return 0;
    }

    private void removeItemAtInt(int i, boolean z) {
        if (i < 0 || i >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i);
        if (z) {
            onItemsChanged(true);
        }
    }

    private void setHeaderInternal(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i > 0) {
                this.mHeaderTitle = resources.getText(i);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i2 > 0) {
                this.mHeaderIcon = e16.m114377e(getContext(), i2);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void setShortcutsVisibleInner(boolean z) {
        boolean z2;
        if (z) {
            z2 = this.mResources.getConfiguration().keyboard != 1 && jbl0.m140796m(ViewConfiguration.get(this.mContext), this.mContext);
        }
        this.mShortcutsVisible = z2;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return addInternal(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        int ordering = getOrdering(i3);
        MenuItemImpl menuItemImplCreateNewMenuItem = createNewMenuItem(i, i2, i3, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            menuItemImplCreateNewMenuItem.setMenuInfo(contextMenuInfo);
        }
        ArrayList<MenuItemImpl> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), menuItemImplCreateNewMenuItem);
        onItemsChanged(true);
        return menuItemImplCreateNewMenuItem;
    }

    public void addMenuPresenter(InterfaceC0091g interfaceC0091g, Context context) {
        this.mPresenters.add(new WeakReference<>(interfaceC0091g));
        interfaceC0091g.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i, i2, i3, charSequence);
        SubMenuC0094j subMenuC0094j = new SubMenuC0094j(this.mContext, this, menuItemImpl);
        menuItemImpl.setSubMenu(subMenuC0094j);
        return subMenuC0094j;
    }

    public void changeMenuMode() {
        InterfaceC0078a interfaceC0078a = this.mCallback;
        if (interfaceC0078a != null) {
            interfaceC0078a.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl = this.mExpandedItem;
        if (menuItemImpl != null) {
            collapseItemActionView(menuItemImpl);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference<InterfaceC0091g> weakReference : this.mPresenters) {
            InterfaceC0091g interfaceC0091g = weakReference.get();
            if (interfaceC0091g == null) {
                this.mPresenters.remove(weakReference);
            } else {
                interfaceC0091g.onCloseMenu(this, z);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == menuItemImpl) {
            stopDispatchingItemsChanged();
            for (WeakReference<InterfaceC0091g> weakReference : this.mPresenters) {
                InterfaceC0091g interfaceC0091g = weakReference.get();
                if (interfaceC0091g != null) {
                    zCollapseItemActionView = interfaceC0091g.collapseItemActionView(this, menuItemImpl);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.mPresenters.remove(weakReference);
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public boolean dispatchMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        InterfaceC0078a interfaceC0078a = this.mCallback;
        return interfaceC0078a != null && interfaceC0078a.onMenuItemSelected(menuBuilder, menuItem);
    }

    public boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<InterfaceC0091g> weakReference : this.mPresenters) {
            InterfaceC0091g interfaceC0091g = weakReference.get();
            if (interfaceC0091g != null) {
                zExpandItemActionView = interfaceC0091g.expandItemActionView(this, menuItemImpl);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.mPresenters.remove(weakReference);
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = menuItemImpl;
        }
        return zExpandItemActionView;
    }

    public int findGroupIndex(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.mItems.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getItemId() == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.mItems.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public MenuItemImpl findItemWithShortcutForKey(int i, KeyEvent keyEvent) {
        ArrayList<MenuItemImpl> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = arrayList.get(i2);
            char alphabeticShortcut = zIsQwertyMode ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && alphabeticShortcut == '\b' && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<MenuItemImpl> list, int i, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.mItems.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl menuItemImpl = this.mItems.get(i2);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).findItemsWithShortcutForKey(list, i, keyEvent);
                }
                char alphabeticShortcut = zIsQwertyMode ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
                if ((modifiers & 69647) == ((zIsQwertyMode ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zIsQwertyMode && alphabeticShortcut == '\b' && i == 67)) && menuItemImpl.isEnabled()) {
                        list.add(menuItemImpl);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<MenuItemImpl> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (WeakReference<InterfaceC0091g> weakReference : this.mPresenters) {
                InterfaceC0091g interfaceC0091g = weakReference.get();
                if (interfaceC0091g == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= interfaceC0091g.flagActionItems();
                }
            }
            ArrayList<MenuItemImpl> arrayList = this.mActionItems;
            if (zFlagActionItems) {
                arrayList.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i = 0; i < size; i++) {
                    MenuItemImpl menuItemImpl = visibleItems.get(i);
                    if (menuItemImpl.isActionButton()) {
                        this.mActionItems.add(menuItemImpl);
                    } else {
                        this.mNonActionItems.add(menuItemImpl);
                    }
                }
            } else {
                arrayList.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<MenuItemImpl> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public MenuItemImpl getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    public ArrayList<MenuItemImpl> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public MenuBuilder getRootMenu() {
        return this;
    }

    @NonNull
    public ArrayList<MenuItemImpl> getVisibleItems() {
        boolean z = this.mIsVisibleItemsStale;
        ArrayList<MenuItemImpl> arrayList = this.mVisibleItems;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i);
            if (menuItemImpl.isVisible()) {
                this.mVisibleItems.add(menuItemImpl);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.mItems.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(MenuItemImpl menuItemImpl) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(MenuItemImpl menuItemImpl) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        dispatchPresenterUpdate(z);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return performItemAction(findItem(i), i2);
    }

    public boolean performItemAction(MenuItem menuItem, InterfaceC0091g interfaceC0091g, int i) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean zInvoke = menuItemImpl.invoke();
        z30 supportActionProvider = menuItemImpl.getSupportActionProvider();
        boolean z = supportActionProvider != null && supportActionProvider.mo384a();
        if (menuItemImpl.hasCollapsibleActionView()) {
            boolean zExpandActionView = menuItemImpl.expandActionView() | zInvoke;
            if (zExpandActionView) {
                close(true);
            }
            return zExpandActionView;
        }
        if (!menuItemImpl.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                close(true);
            }
            return zInvoke;
        }
        if ((i & 4) == 0) {
            close(false);
        }
        if (!menuItemImpl.hasSubMenu()) {
            menuItemImpl.setSubMenu(new SubMenuC0094j(getContext(), this, menuItemImpl));
        }
        SubMenuC0094j subMenuC0094j = (SubMenuC0094j) menuItemImpl.getSubMenu();
        if (z) {
            supportActionProvider.mo387f(subMenuC0094j);
        }
        boolean zDispatchSubMenuSelected = dispatchSubMenuSelected(subMenuC0094j, interfaceC0091g) | zInvoke;
        if (!zDispatchSubMenuSelected) {
            close(true);
        }
        return zDispatchSubMenuSelected;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemImpl menuItemImplFindItemWithShortcutForKey = findItemWithShortcutForKey(i, keyEvent);
        boolean zPerformItemAction = menuItemImplFindItemWithShortcutForKey != null ? performItemAction(menuItemImplFindItemWithShortcutForKey, i2) : false;
        if ((i2 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iFindGroupIndex = findGroupIndex(i);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.mItems.get(iFindGroupIndex).getGroupId() != i) {
                    break;
                }
                removeItemAtInt(iFindGroupIndex, false);
                i2 = i3;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        removeItemAtInt(findItemIndex(i), true);
    }

    public void removeItemAt(int i) {
        removeItemAtInt(i, true);
    }

    public void removeMenuPresenter(InterfaceC0091g interfaceC0091g) {
        for (WeakReference<InterfaceC0091g> weakReference : this.mPresenters) {
            InterfaceC0091g interfaceC0091g2 = weakReference.get();
            if (interfaceC0091g2 == null || interfaceC0091g2 == interfaceC0091g) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0094j) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i2 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0094j) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(InterfaceC0078a interfaceC0078a) {
        this.mCallback = interfaceC0078a;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public MenuBuilder setDefaultShowAsAction(int i) {
        this.mDefaultShowAsAction = i;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.isExclusiveCheckable() && menuItemImpl.isCheckable()) {
                menuItemImpl.setCheckedInt(menuItemImpl == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setExclusiveCheckable(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mGroupDividerEnabled = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.mItems.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.mItems.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i2);
            if (menuItemImpl.getGroupId() == i && menuItemImpl.setVisibleInt(z)) {
                z2 = true;
            }
        }
        if (z2) {
            onItemsChanged(true);
        }
    }

    public MenuBuilder setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    public MenuBuilder setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    public MenuBuilder setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z) {
        this.mOptionalIconsVisible = z;
    }

    public void setOverrideVisibleItems(boolean z) {
        this.mOverrideVisibleItems = z;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mQwertyMode = z;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z) {
        if (this.mShortcutsVisible == z) {
            return;
        }
        setShortcutsVisibleInner(z);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    public MenuBuilder setHeaderIconInt(int i) {
        setHeaderInternal(0, null, i, null, null);
        return this;
    }

    public MenuBuilder setHeaderTitleInt(int i) {
        setHeaderInternal(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return addInternal(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return addInternal(i, i2, i3, this.mResources.getString(i4));
    }

    public void addMenuPresenter(InterfaceC0091g interfaceC0091g) {
        addMenuPresenter(interfaceC0091g, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.mResources.getString(i4));
    }

    public int findGroupIndex(int i) {
        return findGroupIndex(i, 0);
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public boolean performItemAction(MenuItem menuItem, int i) {
        return performItemAction(menuItem, null, i);
    }
}

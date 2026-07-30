package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.nm6;
import p153l.p9r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020)0%8\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010,R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120%8\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010,¨\u00061"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/messages/ConversationTitleSwitcher;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "onFinishInflate", "()V", "position", "setTabSelected", "(I)V", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "get_tabs", "()Lcom/google/android/material/tabs/TabLayout;", "set_tabs", "(Lcom/google/android/material/tabs/TabLayout;)V", "_tabs", "", "Lcom/google/android/material/tabs/TabLayout$Tab;", "Ljava/util/List;", "tabList", "Lv/VText;", "c", "getTableTitle", "()Ljava/util/List;", "tableTitle", Constants.INAPP_DATA_TAG, "getDotTitle", "dotTitle", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ConversationTitleSwitcher extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public TabLayout _tabs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<TabLayout.Tab> tabList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<VText> tableTitle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<View> dotTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationTitleSwitcher(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.tabList = new ArrayList();
        this.tableTitle = new ArrayList();
        this.dotTitle = new ArrayList();
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(context);
        layoutInflaterM171370a.getClass();
        addView(m42319b(layoutInflaterM171370a, this));
    }

    /* JADX INFO: renamed from: a */
    public final void m42318a(View view) {
        nm6.m163802a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m42319b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM163803b = nm6.m163803b(this, inflater, parent);
        viewM163803b.getClass();
        return viewM163803b;
    }

    @NotNull
    public final List<View> getDotTitle() {
        return this.dotTitle;
    }

    @NotNull
    public final List<VText> getTableTitle() {
        return this.tableTitle;
    }

    @NotNull
    public final TabLayout get_tabs() {
        TabLayout tabLayout = this._tabs;
        if (tabLayout != null) {
            return tabLayout;
        }
        Intrinsics.m88391r("_tabs");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42318a(this);
    }

    public final void setTabSelected(int position) {
        if (position < this.tabList.size()) {
            get_tabs().selectTab(this.tabList.get(position));
        }
    }

    public final void set_tabs(@NotNull TabLayout tabLayout) {
        tabLayout.getClass();
        this._tabs = tabLayout;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationTitleSwitcher(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationTitleSwitcher(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConversationTitleSwitcher(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}

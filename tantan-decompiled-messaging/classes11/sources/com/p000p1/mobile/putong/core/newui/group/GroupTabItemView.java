package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.GroupTab;
import l.c3c0;
import l.e30;
import l.gnk;
import l.jo0;
import l.mcr;
import l.mkd0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupTabItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public GroupTabItemView f356a;

    /* JADX INFO: renamed from: b */
    public VText f357b;

    /* JADX INFO: renamed from: c */
    public GroupTab f358c;

    public GroupTabItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m556b(View view) {
        gnk.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m557c(GroupTab groupTab) {
        boolean z = this.f358c.id == groupTab.id;
        this.f357b.setBackgroundResource(z ? c3c0.E : 0);
        this.f357b.setSelected(z);
    }

    /* JADX INFO: renamed from: d */
    public void m558d(GroupTab groupTab, mcr mcrVar) {
        this.f358c = groupTab;
        this.f357b.setText(groupTab.name);
        mcrVar.duringCreated(CoreModule.c.g0.h9()).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.fnk
            public final void call(Object obj) {
                this.f13104a.m557c((GroupTab) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m556b(this);
    }

    public GroupTabItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupTabItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GroupTab;
import p147v.VText;
import p149l.c3c0;
import p149l.e30;
import p149l.gnk;
import p149l.jo0;
import p149l.mcr;
import p149l.mkd0;

/* JADX INFO: loaded from: classes11.dex */
public class GroupTabItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public GroupTabItemView f21578a;

    /* JADX INFO: renamed from: b */
    public VText f21579b;

    /* JADX INFO: renamed from: c */
    public GroupTab f21580c;

    public GroupTabItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m36614b(View view) {
        gnk.m127141a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m36615c(GroupTab groupTab) {
        boolean z = this.f21580c.f20407id == groupTab.f20407id;
        this.f21579b.setBackgroundResource(z ? c3c0.f78503E : 0);
        this.f21579b.setSelected(z);
    }

    /* JADX INFO: renamed from: d */
    public void m36616d(GroupTab groupTab, mcr mcrVar) {
        this.f21580c = groupTab;
        this.f21579b.setText(groupTab.name);
        mcrVar.duringCreated(CoreModule.f17545c.f19645g0.m31888h9()).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.fnk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98427a.m36615c((GroupTab) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36614b(this);
    }

    public GroupTabItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupTabItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GroupTab;
import p151v.VText;
import p153l.fo0;
import p153l.ibc0;
import p153l.ner;
import p153l.psd0;
import p153l.wpk;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class GroupTabItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public GroupTabItemView f22320a;

    /* JADX INFO: renamed from: b */
    public VText f22321b;

    /* JADX INFO: renamed from: c */
    public GroupTab f22322c;

    public GroupTabItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m37617b(View view) {
        wpk.m207465a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m37618c(GroupTab groupTab) {
        boolean z = this.f22322c.f21149id == groupTab.f21149id;
        this.f22321b.setBackgroundResource(z ? ibc0.f113778E : 0);
        this.f22321b.setSelected(z);
    }

    /* JADX INFO: renamed from: d */
    public void m37619d(GroupTab groupTab, ner nerVar) {
        this.f22322c = groupTab;
        this.f22321b.setText(groupTab.name);
        nerVar.duringCreated(CoreModule.f18264c.f20387g0.m32891h9()).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.vpk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185267a.m37618c((GroupTab) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37617b(this);
    }

    public GroupTabItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupTabItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

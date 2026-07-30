package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.spy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceSpyDialogViewBindings;
import p149l.h4t;
import p149l.hxs;
import p149l.j7n0;
import p149l.krf0;
import p149l.t100;
import p149l.url;
import p149l.w7n0;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes5.dex */
public class SpyDialogView extends LiveVirtualVoiceSpyDialogViewBindings<krf0> implements url {
    public SpyDialogView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m77335j(View view) {
        ((krf0) this.f48158a).m146975K3();
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: a */
    public void mo77327a(@NonNull j7n0 j7n0Var) {
        xdl0.m208329E0(this.f48161d, new View.OnClickListener() { // from class: l.lrf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129694a.m77335j(view);
            }
        });
        this.f48161d.setSelected(true);
        xdl0.m208325C0(this.f48160c, (int) ((xdl0.m208412y0() - t100.f167276y) * 0.53731346f));
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: b */
    public void mo77328b(boolean z) {
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: c */
    public void mo77329c() {
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: d */
    public void mo77330d() {
    }

    @Override // p149l.url
    /* JADX INFO: renamed from: e */
    public void mo77331e() {
        w7n0.m202029f((h4t) this.f48158a, VirtualVoiceMotionType.undercover);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceSpyDialogViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        hxs.m133406s("context_livingAct", this.f48160c, ydt.f197613c);
    }

    public SpyDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpyDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

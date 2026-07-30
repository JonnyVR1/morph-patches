package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.spy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceSpyDialogViewBindings;
import p153l.ahn0;
import p153l.bnl0;
import p153l.i6t;
import p153l.iul;
import p153l.izs;
import p153l.ngn0;
import p153l.qa00;
import p153l.tzf0;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
public class SpyDialogView extends LiveVirtualVoiceSpyDialogViewBindings<tzf0> implements iul {
    public SpyDialogView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m78518j(View view) {
        ((tzf0) this.f49006a).m193659K3();
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: a */
    public void mo78510a(@NonNull ngn0 ngn0Var) {
        bnl0.m105509E0(this.f49009d, new View.OnClickListener() { // from class: l.uzf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181787a.m78518j(view);
            }
        });
        this.f49009d.setSelected(true);
        bnl0.m105505C0(this.f49008c, (int) ((bnl0.m105592y0() - qa00.f156338y) * 0.53731346f));
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: b */
    public void mo78511b(boolean z) {
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: c */
    public void mo78512c() {
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: d */
    public void mo78513d() {
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: e */
    public void mo78514e() {
        ahn0.m97864f((i6t) this.f49006a, VirtualVoiceMotionType.undercover);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceSpyDialogViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        izs.m142868s("context_livingAct", this.f49008c, zft.f204208c);
    }

    public SpyDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpyDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p051p1.mobile.putong.live.livingroom.virtual.room.close;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceCloseAreaViewBindings;
import p153l.bnl0;
import p153l.y7m0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceCloseView extends LiveVirtualVoiceCloseAreaViewBindings<y7m0> {
    public VirtualVoiceCloseView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m78504l0(View view) {
        ((y7m0) this.f48951d).m214553W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m78505m0(View view) {
        ((y7m0) this.f48951d).m214557a4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m78506n0(View view) {
        ((y7m0) this.f48951d).m214555Y3();
    }

    /* JADX INFO: renamed from: r */
    private void m78507r() {
        bnl0.m105509E0(this.f48953f, new View.OnClickListener() { // from class: l.z7m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203256a.m78504l0(view);
            }
        });
        bnl0.m105509E0(this.f48954g, new View.OnClickListener() { // from class: l.a8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68933a.m78505m0(view);
            }
        });
        bnl0.m105509E0(this.f48955h, new View.OnClickListener() { // from class: l.b8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75445a.m78506n0(view);
            }
        });
    }

    /* JADX INFO: renamed from: o0 */
    public void m78508o0(String str) {
        bnl0.m105524M(this.f48954g, true);
        bnl0.m105524M(this.f48955h, false);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceCloseAreaViewBindings, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78507r();
    }

    public VirtualVoiceCloseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceCloseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

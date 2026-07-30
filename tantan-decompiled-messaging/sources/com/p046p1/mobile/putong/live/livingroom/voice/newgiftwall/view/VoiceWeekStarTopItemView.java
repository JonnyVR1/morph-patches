package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p149l.g5c0;
import p149l.jtk;
import p149l.ptk;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceWeekStarTopItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public String f53801d;

    /* JADX INFO: renamed from: e */
    public String f53802e;

    /* JADX INFO: renamed from: f */
    public View f53803f;

    public VoiceWeekStarTopItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m78699k0(View view) {
        m78702n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m78700l0(String str) {
        ptk.m171332h().m171334g(this.f53802e);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m78701m0(String str) {
        this.f53802e = null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78702n0() {
        if (TextUtils.isEmpty(this.f53801d) || !TextUtils.isEmpty(this.f53802e)) {
            return;
        }
        ptk ptkVarM171332h = ptk.m171332h();
        jtk jtkVarM143130v = new jtk(getContext()).m143129u(this.f53801d).m143128t(13).m143111c(true).m143113e(Color.parseColor("#FE7E1D")).m143130v(false);
        int i = t100.f167264m;
        int i2 = t100.f167260i;
        this.f53802e = ptkVarM171332h.m171346t(jtkVarM143130v.m143127s(i, i2, i, i2).m143109a(3000L).m143117i(jtk.f119617D | jtk.f119616C).m143114f(t100.m186890d(7.0f)).m143110b(new jtk.InterfaceC17856a() { // from class: l.vcp0
            @Override // p149l.jtk.InterfaceC17856a
            /* JADX INFO: renamed from: a */
            public final void mo125326a(String str) {
                this.f180972a.m78700l0(str);
            }
        }).m143112d(new jtk.InterfaceC17857b() { // from class: l.wcp0
            @Override // p149l.jtk.InterfaceC17857b
            /* JADX INFO: renamed from: a */
            public final void mo135260a(String str) {
                this.f185705a.m78701m0(str);
            }
        }), this.f53803f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(g5c0.f101114z5);
        this.f53803f = viewFindViewById;
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.ucp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175841a.m78699k0(view);
            }
        });
    }

    public void setBubbleText(String str) {
        this.f53801d = str;
    }

    public VoiceWeekStarTopItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceWeekStarTopItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.g5c0;
import l.t100;
import l.xdl0;
import p009l.jtk;
import p009l.ptk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceWeekStarTopItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public String f7407d;

    /* JADX INFO: renamed from: e */
    public String f7408e;

    /* JADX INFO: renamed from: f */
    public View f7409f;

    public VoiceWeekStarTopItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m8915k0(View view) {
        m8918n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m8916l0(String str) {
        ptk.m20688h().m20690g(this.f7408e);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m8917m0(String str) {
        this.f7408e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final void m8918n0() {
        if (TextUtils.isEmpty(this.f7407d) || !TextUtils.isEmpty(this.f7408e)) {
            return;
        }
        ptk ptkVarM20688h = ptk.m20688h();
        jtk jtkVarM17214v = new jtk(getContext()).m17213u(this.f7407d).m17212t(13).m17195c(true).m17197e(Color.parseColor("#FE7E1D")).m17214v(false);
        int i = t100.m;
        int i2 = t100.i;
        this.f7408e = ptkVarM20688h.m20702t(jtkVarM17214v.m17211s(i, i2, i, i2).m17193a(3000L).m17201i(jtk.f15296D | jtk.f15295C).m17198f(t100.d(7.0f)).m17194b(new jtk.InterfaceC0979a() { // from class: l.vcp0
            @Override // p009l.jtk.InterfaceC0979a
            /* JADX INFO: renamed from: a */
            public final void mo17215a(String str) {
                this.f21536a.m8916l0(str);
            }
        }).m17196d(new jtk.InterfaceC0980b() { // from class: l.wcp0
            @Override // p009l.jtk.InterfaceC0980b
            /* JADX INFO: renamed from: a */
            public final void mo17216a(String str) {
                this.f22006a.m8917m0(str);
            }
        }), this.f7409f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        View viewFindViewById = findViewById(g5c0.z5);
        this.f7409f = viewFindViewById;
        xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.ucp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21072a.m8915k0(view);
            }
        });
    }

    public void setBubbleText(String str) {
        this.f7407d = str;
    }

    public VoiceWeekStarTopItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceWeekStarTopItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p153l.bnl0;
import p153l.fwk;
import p153l.mdc0;
import p153l.qa00;
import p153l.zvk;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceWeekStarTopItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public String f54649d;

    /* JADX INFO: renamed from: e */
    public String f54650e;

    /* JADX INFO: renamed from: f */
    public View f54651f;

    public VoiceWeekStarTopItemView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m79882k0(View view) {
        m79885n0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m79883l0(String str) {
        fwk.m127777h().m127779g(this.f54650e);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m79884m0(String str) {
        this.f54650e = null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m79885n0() {
        if (TextUtils.isEmpty(this.f54649d) || !TextUtils.isEmpty(this.f54650e)) {
            return;
        }
        fwk fwkVarM127777h = fwk.m127777h();
        zvk zvkVarM221777v = new zvk(getContext()).m221776u(this.f54649d).m221775t(13).m221758c(true).m221760e(Color.parseColor("#FE7E1D")).m221777v(false);
        int i = qa00.f156326m;
        int i2 = qa00.f156322i;
        this.f54650e = fwkVarM127777h.m127791t(zvkVarM221777v.m221774s(i, i2, i, i2).m221756a(3000L).m221764i(zvk.f206227D | zvk.f206226C).m221761f(qa00.m175859d(7.0f)).m221757b(new zvk.InterfaceC21905a() { // from class: l.zlp0
            @Override // p153l.zvk.InterfaceC21905a
            /* JADX INFO: renamed from: a */
            public final void mo102709a(String str) {
                this.f204989a.m79883l0(str);
            }
        }).m221759d(new zvk.InterfaceC21906b() { // from class: l.amp0
            @Override // p153l.zvk.InterfaceC21906b
            /* JADX INFO: renamed from: a */
            public final void mo96261a(String str) {
                this.f72243a.m79884m0(str);
            }
        }), this.f54651f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(mdc0.f136359z5);
        this.f54651f = viewFindViewById;
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.ylp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200578a.m79882k0(view);
            }
        });
    }

    public void setBubbleText(String str) {
        this.f54649d = str;
    }

    public VoiceWeekStarTopItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceWeekStarTopItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

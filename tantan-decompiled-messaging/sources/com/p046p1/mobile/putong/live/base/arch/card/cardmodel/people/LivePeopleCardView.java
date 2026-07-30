package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.people;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.d5c0;
import p149l.hxs;
import p149l.t100;
import p149l.t9t;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LivePeopleCardView extends ConstraintLayout {
    public VLinear _tips_layout;
    public AnimEffectPlayer _tips_layout_attribute_icon;
    public VText _tips_layout_tips;
    public VDraweeView _user_avatar;
    public VText _user_content;
    public VText _user_name;
    public VDraweeView _user_tagicon;

    public LivePeopleCardView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m67511h0(t9t t9tVar) {
        if (t9tVar == null) {
            return;
        }
        this._tips_layout_tips.setText(t9tVar.m187647g());
        hxs.m133406s("context_square", this._user_avatar, t9tVar.m187642b());
        boolean zIsEmpty = TextUtils.isEmpty(t9tVar.m187646f());
        VDraweeView vDraweeView = this._user_tagicon;
        if (zIsEmpty) {
            xdl0.m208345M0(vDraweeView, false);
        } else {
            xdl0.m208345M0(vDraweeView, true);
            hxs.m133406s("context_square", this._user_tagicon, t9tVar.m187646f());
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(t9tVar.m187641a())) {
            sb.append(t9tVar.m187641a());
        }
        if (!TextUtils.isEmpty(t9tVar.m187643c())) {
            if (!TextUtils.isEmpty(t9tVar.m187641a())) {
                sb.append(" · ");
            }
            sb.append(t9tVar.m187643c());
        }
        this._user_content.setText(sb);
        this._user_name.setText(t9tVar.m187645e());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._user_avatar = (VDraweeView) findViewById(d5c0.f84484i1);
        this._tips_layout = (VLinear) findViewById(d5c0.f84455Y0);
        this._tips_layout_attribute_icon = (AnimEffectPlayer) findViewById(d5c0.f84476g);
        this._tips_layout_tips = (VText) findViewById(d5c0.f84453X0);
        this._user_name = (VText) findViewById(d5c0.f84490k1);
        this._user_tagicon = (VDraweeView) findViewById(d5c0.f84493l1);
        this._user_content = (VText) findViewById(d5c0.f84487j1);
        int iM208412y0 = (xdl0.m208412y0() - t100.f167264m) / 2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = iM208412y0;
        setLayoutParams(layoutParams);
        this._tips_layout_attribute_icon.m68500j("https://auto.tancdn.com/v1/raw/5d90da75-e2f5-4f51-96f7-a1943b54a25514.pdf", -1);
    }

    public LivePeopleCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePeopleCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

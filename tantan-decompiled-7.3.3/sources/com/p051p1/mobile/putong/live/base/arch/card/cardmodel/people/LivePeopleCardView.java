package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.people;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.jdc0;
import p153l.qa00;
import p153l.ubt;

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
    public void m68694h0(ubt ubtVar) {
        if (ubtVar == null) {
            return;
        }
        this._tips_layout_tips.setText(ubtVar.m195301g());
        izs.m142868s("context_square", this._user_avatar, ubtVar.m195296b());
        boolean zIsEmpty = TextUtils.isEmpty(ubtVar.m195300f());
        VDraweeView vDraweeView = this._user_tagicon;
        if (zIsEmpty) {
            bnl0.m105525M0(vDraweeView, false);
        } else {
            bnl0.m105525M0(vDraweeView, true);
            izs.m142868s("context_square", this._user_tagicon, ubtVar.m195300f());
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(ubtVar.m195295a())) {
            sb.append(ubtVar.m195295a());
        }
        if (!TextUtils.isEmpty(ubtVar.m195297c())) {
            if (!TextUtils.isEmpty(ubtVar.m195295a())) {
                sb.append(" · ");
            }
            sb.append(ubtVar.m195297c());
        }
        this._user_content.setText(sb);
        this._user_name.setText(ubtVar.m195299e());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this._user_avatar = (VDraweeView) findViewById(jdc0.f120202i1);
        this._tips_layout = (VLinear) findViewById(jdc0.f120173Y0);
        this._tips_layout_attribute_icon = (AnimEffectPlayer) findViewById(jdc0.f120194g);
        this._tips_layout_tips = (VText) findViewById(jdc0.f120171X0);
        this._user_name = (VText) findViewById(jdc0.f120208k1);
        this._user_tagicon = (VDraweeView) findViewById(jdc0.f120211l1);
        this._user_content = (VText) findViewById(jdc0.f120205j1);
        int iM105592y0 = (bnl0.m105592y0() - qa00.f156326m) / 2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = iM105592y0;
        setLayoutParams(layoutParams);
        this._tips_layout_attribute_icon.m69683j("https://auto.tancdn.com/v1/raw/5d90da75-e2f5-4f51-96f7-a1943b54a25514.pdf", -1);
    }

    public LivePeopleCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LivePeopleCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

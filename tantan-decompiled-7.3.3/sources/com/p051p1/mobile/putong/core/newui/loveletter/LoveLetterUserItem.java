package com.p051p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ConvAdditionalLoveLetter;
import com.p051p1.mobile.putong.core.data.ConvAdditionalLoveLetterTag;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterUserItem;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.few;
import p153l.hxf;
import p153l.i4g0;
import p153l.jic0;
import p153l.jyb;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qew;
import p153l.qu20;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterUserItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LoveLetterUserItem f25141a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f25142b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f25143c;

    /* JADX INFO: renamed from: d */
    public View f25144d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f25145e;

    /* JADX INFO: renamed from: f */
    public VLinear f25146f;

    /* JADX INFO: renamed from: g */
    public VText f25147g;

    /* JADX INFO: renamed from: h */
    public VText f25148h;

    /* JADX INFO: renamed from: i */
    public VText f25149i;

    /* JADX INFO: renamed from: j */
    public User f25150j;

    /* JADX INFO: renamed from: k */
    public Conversation f25151k;

    /* JADX INFO: renamed from: l */
    public String f25152l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.LoveLetterUserItem$a */
    public class C8237a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f25153a;

        public C8237a(Act act) {
            this.f25153a = act;
        }

        @Override // p153l.x20
        public void call() {
            hxf.m137587h(this.f25153a, OMSTemplateType.dialog);
        }
    }

    public LoveLetterUserItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m40598a() {
    }

    private int getRootHeight() {
        return (int) (((double) ((qa00.m175858c().widthPixels - qa00.f156330q) / 2)) * 1.333d);
    }

    /* JADX INFO: renamed from: d */
    public final void m40601d(View view) {
        qew.m176276a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m40602e(y20 y20Var, few fewVar, String str, pf60 pf60Var) {
        User user = (User) pf60Var.f152156a;
        this.f25150j = user;
        this.f25151k = (Conversation) pf60Var.f152157b;
        if (user.isBanedOrInactivated() || TEnum.equals(this.f25151k.status, "dismissed") || TEnum.equals(this.f25151k.status, "blocked") || TEnum.equals(this.f25151k.status, "deleted")) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(this.f25150j.f56859id);
                return;
            }
            return;
        }
        uqb0.f180374G.m127119N0(this.f25142b, this.f25150j.m61308fp().maxWidth(480).formatted(), false);
        String strConcat = "";
        this.f25152l = "";
        if (this.f25150j.isIdAndPicBothVerified()) {
            bnl0.m105524M(this.f25144d, true);
            this.f25144d.setBackgroundResource(dbc0.f86927dj);
            bnl0.m105507D0(qa00.f156302O, this.f25144d);
            this.f25152l = "实名·头像本人";
        } else {
            boolean zIsPicVerificationVerified = this.f25150j.isPicVerificationVerified();
            View view = this.f25144d;
            if (zIsPicVerificationVerified) {
                bnl0.m105524M(view, true);
                this.f25144d.setBackgroundResource(dbc0.f86894cj);
                bnl0.m105507D0(qa00.m175859d(67.0f), this.f25144d);
                this.f25152l = "头像本人";
            } else {
                bnl0.m105524M(view, false);
            }
        }
        ConvAdditionalLoveLetter convAdditionalLoveLetter = this.f25151k.additional.loveLetter;
        if (convAdditionalLoveLetter == null || jyb.m147479J(convAdditionalLoveLetter.suggestTags)) {
            bnl0.m105524M(this.f25143c, false);
        } else {
            ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag = this.f25151k.additional.loveLetter.suggestTags.get(0);
            bnl0.m105524M(this.f25143c, true);
            this.f25143c.setText(convAdditionalLoveLetterTag.tag);
            boolean zIsEmpty = TextUtils.isEmpty(this.f25152l);
            String str2 = convAdditionalLoveLetterTag.tag;
            if (!zIsEmpty) {
                str2 = Constants.SEPARATOR_COMMA + str2;
            }
            this.f25152l += str2;
        }
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(this.f25150j.f56859id);
        boolean zIsEmpty2 = TextUtils.isEmpty(strM116634y7);
        VText vText = this.f25147g;
        if (zIsEmpty2) {
            vText.setText(this.f25150j.name);
        } else {
            vText.setText(strM116634y7);
        }
        this.f25148h.setText(String.valueOf(this.f25150j.age));
        bnl0.m105524M(this.f25148h, !this.f25150j.isHideAgeFromSVip());
        boolean zIsHideLocationFromSVip = this.f25150j.isHideLocationFromSVip();
        boolean zIsHideActiveFromSVip = this.f25150j.isHideActiveFromSVip();
        if (zIsHideLocationFromSVip && zIsHideActiveFromSVip) {
            bnl0.m105524M(this.f25149i, false);
        } else {
            bnl0.m105524M(this.f25149i, true);
            if (zIsHideActiveFromSVip || !CoreModule.f18264c.f20330N0.m32970k3(this.f25150j, 5)) {
                this.f25149i.setCompoundDrawables(null, null, null, null);
            } else {
                Drawable drawable = getContext().getDrawable(dbc0.f87221mj);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f25149i.setCompoundDrawables(drawable, null, null, null);
                strConcat = "在线";
            }
            if (!zIsHideLocationFromSVip) {
                if (!TextUtils.isEmpty(strConcat)) {
                    strConcat = strConcat.concat(" · ");
                }
                strConcat = strConcat + q8g0.m175811p(this.f25150j.location.distance, true);
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(strConcat);
            VText vText2 = this.f25149i;
            if (zIsEmpty3) {
                bnl0.m105524M(vText2, false);
            } else {
                vText2.setText(strConcat);
            }
        }
        boolean zSuperLikedMe = this.f25150j.superLikedMe();
        FrameLayout frameLayout = this.f25145e;
        if (zSuperLikedMe) {
            frameLayout.setBackgroundResource(dbc0.f86250Ih);
            bnl0.m105505C0(this.f25145e, (getRootHeight() * qa00.m175859d(57.0f)) / qa00.m175859d(234.0f));
        } else {
            frameLayout.setBackgroundResource(dbc0.f86409Ng);
            bnl0.m105505C0(this.f25145e, (getRootHeight() * qa00.m175859d(108.0f)) / qa00.m175859d(234.0f));
        }
        i4g0.m138492A("e_user_card", fewVar.pageId(), new pf60("to_uid", str), new pf60("card_tag", this.f25152l));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m40603f(few fewVar, String str, View view) {
        i4g0.m138523u("e_user_card", fewVar.pageId(), new pf60("to_uid", str), new pf60("card_tag", this.f25152l));
        if (CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified()) {
            fewVar.mo125336R(str);
        } else if (TEnum.equals(CoreModule.f18264c.f20294B0.m32623s4(), "pending")) {
            o1j0.m165651y("请稍后，正在审核中。");
        } else {
            Act act = fewVar.act();
            CoreDlg.m46170G1(act, "请先完成头像本人认证", "认证真实也是表达真诚的一部分，诚意满满的情书更动人", dbc0.f87506v8, "去认证", new C8237a(act), true, "以后再说", new x20() { // from class: l.pew
                @Override // p153l.x20
                public final void call() {
                    LoveLetterUserItem.m40598a();
                }
            }, null, null, true, false, null, null, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m40604g(jic0<C8238a.b> jic0Var, final few fewVar, final String str, final y20<String> y20Var, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        jic0Var.mo68557c(fewVar.act(), psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(str), CoreModule.f18264c.f20384f0.m33740Ne(str), new qu20())).subscribe(psd0.m173596G(new y20() { // from class: l.new
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141689a.m40602e(y20Var, fewVar, str, (pf60) obj);
            }
        }));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.oew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147021a.m40603f(fewVar, str, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40601d(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getRootHeight(), View.MeasureSpec.getMode(i2)));
    }

    public LoveLetterUserItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterUserItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

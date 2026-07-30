package com.p000p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterUserItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ConvAdditionalLoveLetter;
import com.p1.mobile.putong.core.data.ConvAdditionalLoveLetterTag;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.dac0;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.scw;
import l.t100;
import l.tvf;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.gm20;
import p009l.hcw;
import p009l.i0g0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterUserItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LoveLetterUserItem f3177a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f3178b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f3179c;

    /* JADX INFO: renamed from: d */
    public View f3180d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f3181e;

    /* JADX INFO: renamed from: f */
    public VLinear f3182f;

    /* JADX INFO: renamed from: g */
    public VText f3183g;

    /* JADX INFO: renamed from: h */
    public VText f3184h;

    /* JADX INFO: renamed from: i */
    public VText f3185i;

    /* JADX INFO: renamed from: j */
    public User f3186j;

    /* JADX INFO: renamed from: k */
    public Conversation f3187k;

    /* JADX INFO: renamed from: l */
    public String f3188l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.LoveLetterUserItem$a */
    public class C0250a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f3189a;

        public C0250a(Act act) {
            this.f3189a = act;
        }

        public void call() {
            tvf.h(this.f3189a, "dialog");
        }
    }

    public LoveLetterUserItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3666a() {
    }

    private int getRootHeight() {
        return (int) (((double) ((t100.c().widthPixels - t100.q) / 2)) * 1.333d);
    }

    /* JADX INFO: renamed from: d */
    public final void m3669d(View view) {
        scw.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m3670e(e30 e30Var, hcw hcwVar, String str, j760 j760Var) {
        User user = (User) j760Var.a;
        this.f3186j = user;
        this.f3187k = (Conversation) j760Var.b;
        if (user.isBanedOrInactivated() || TEnum.equals(this.f3187k.status, "dismissed") || TEnum.equals(this.f3187k.status, "blocked") || TEnum.equals(this.f3187k.status, "deleted")) {
            if (NullChecker.a(e30Var)) {
                e30Var.call(((DbObject) this.f3186j).id);
                return;
            }
            return;
        }
        qib0.G.N0(this.f3178b, this.f3186j.fp().maxWidth(480).formatted(), false);
        String strConcat = "";
        this.f3188l = "";
        if (this.f3186j.isIdAndPicBothVerified()) {
            xdl0.M(this.f3180d, true);
            this.f3180d.setBackgroundResource(x2c0.pi);
            xdl0.D0(t100.O, new View[]{this.f3180d});
            this.f3188l = "实名·头像本人";
        } else {
            boolean zIsPicVerificationVerified = this.f3186j.isPicVerificationVerified();
            View view = this.f3180d;
            if (zIsPicVerificationVerified) {
                xdl0.M(view, true);
                this.f3180d.setBackgroundResource(x2c0.oi);
                xdl0.D0(t100.d(67.0f), new View[]{this.f3180d});
                this.f3188l = "头像本人";
            } else {
                xdl0.M(view, false);
            }
        }
        ConvAdditionalLoveLetter convAdditionalLoveLetter = this.f3187k.additional.loveLetter;
        if (convAdditionalLoveLetter == null || vwb.J(convAdditionalLoveLetter.suggestTags)) {
            xdl0.M(this.f3179c, false);
        } else {
            ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag = (ConvAdditionalLoveLetterTag) this.f3187k.additional.loveLetter.suggestTags.get(0);
            xdl0.M(this.f3179c, true);
            this.f3179c.setText(convAdditionalLoveLetterTag.tag);
            boolean zIsEmpty = TextUtils.isEmpty(this.f3188l);
            String str2 = convAdditionalLoveLetterTag.tag;
            if (!zIsEmpty) {
                str2 = "," + str2;
            }
            this.f3188l += str2;
        }
        String strY7 = CoreModule.c.e0.y7(((DbObject) this.f3186j).id);
        boolean zIsEmpty2 = TextUtils.isEmpty(strY7);
        VText vText = this.f3183g;
        if (zIsEmpty2) {
            vText.setText(this.f3186j.name);
        } else {
            vText.setText(strY7);
        }
        this.f3184h.setText(String.valueOf(this.f3186j.age));
        xdl0.M(this.f3184h, !this.f3186j.isHideAgeFromSVip());
        boolean zIsHideLocationFromSVip = this.f3186j.isHideLocationFromSVip();
        boolean zIsHideActiveFromSVip = this.f3186j.isHideActiveFromSVip();
        if (zIsHideLocationFromSVip && zIsHideActiveFromSVip) {
            xdl0.M(this.f3185i, false);
        } else {
            xdl0.M(this.f3185i, true);
            if (zIsHideActiveFromSVip || !CoreModule.c.N0.k3(this.f3186j, 5)) {
                this.f3185i.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                Drawable drawable = getContext().getDrawable(x2c0.yi);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f3185i.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                strConcat = "在线";
            }
            if (!zIsHideLocationFromSVip) {
                if (!TextUtils.isEmpty(strConcat)) {
                    strConcat = strConcat.concat(" · ");
                }
                strConcat = strConcat + i0g0.m16144p(this.f3186j.location.distance, true);
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(strConcat);
            VText vText2 = this.f3185i;
            if (zIsEmpty3) {
                xdl0.M(vText2, false);
            } else {
                vText2.setText(strConcat);
            }
        }
        boolean zSuperLikedMe = this.f3186j.superLikedMe();
        FrameLayout frameLayout = this.f3181e;
        if (zSuperLikedMe) {
            frameLayout.setBackgroundResource(x2c0.Ug);
            xdl0.C0(this.f3181e, (getRootHeight() * t100.d(57.0f)) / t100.d(234.0f));
        } else {
            frameLayout.setBackgroundResource(x2c0.Zf);
            xdl0.C0(this.f3181e, (getRootHeight() * t100.d(108.0f)) / t100.d(234.0f));
        }
        zvf0.A("e_user_card", hcwVar.pageId(), new j760[]{new j760("to_uid", str), new j760("card_tag", this.f3188l)});
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m3671f(hcw hcwVar, String str, View view) {
        zvf0.u("e_user_card", hcwVar.pageId(), new j760[]{new j760("to_uid", str), new j760("card_tag", this.f3188l)});
        if (CoreModule.c.e0.p9().isPicVerificationVerified()) {
            hcwVar.mo15581R(str);
        } else if (TEnum.equals(CoreModule.c.B0.s4(), "pending")) {
            lsi0.y("请稍后，正在审核中。");
        } else {
            Act act = hcwVar.act();
            CoreDlg.G1(act, "请先完成头像本人认证", "认证真实也是表达真诚的一部分，诚意满满的情书更动人", x2c0.u8, "去认证", new C0250a(act), true, "以后再说", new d30() { // from class: l.rcw
                public final void call() {
                    LoveLetterUserItem.m3666a();
                }
            }, (d30) null, (User) null, true, false, (String) null, (d30) null, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m3672g(dac0<C0251a.b> dac0Var, final hcw hcwVar, final String str, final e30<String> e30Var, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dac0Var.c(hcwVar.act(), mkd0.r(CoreModule.c.e0.Ka(str), CoreModule.c.f0.Ne(str), new gm20())).subscribe(mkd0.G(new e30() { // from class: l.pcw
            public final void call(Object obj) {
                this.f18480a.m3670e(e30Var, hcwVar, str, (j760) obj);
            }
        }));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.qcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19142a.m3671f(hcwVar, str, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3669d(this);
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

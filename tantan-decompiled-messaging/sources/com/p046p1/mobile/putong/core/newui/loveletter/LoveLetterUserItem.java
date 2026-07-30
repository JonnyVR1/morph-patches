package com.p046p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ConvAdditionalLoveLetter;
import com.p046p1.mobile.putong.core.data.ConvAdditionalLoveLetterTag;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterUserItem;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.gm20;
import p149l.hcw;
import p149l.i0g0;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.scw;
import p149l.t100;
import p149l.tvf;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterUserItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LoveLetterUserItem f24399a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f24400b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f24401c;

    /* JADX INFO: renamed from: d */
    public View f24402d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f24403e;

    /* JADX INFO: renamed from: f */
    public VLinear f24404f;

    /* JADX INFO: renamed from: g */
    public VText f24405g;

    /* JADX INFO: renamed from: h */
    public VText f24406h;

    /* JADX INFO: renamed from: i */
    public VText f24407i;

    /* JADX INFO: renamed from: j */
    public User f24408j;

    /* JADX INFO: renamed from: k */
    public Conversation f24409k;

    /* JADX INFO: renamed from: l */
    public String f24410l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.loveletter.LoveLetterUserItem$a */
    public class C8086a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f24411a;

        public C8086a(Act act) {
            this.f24411a = act;
        }

        @Override // p149l.d30
        public void call() {
            tvf.m190730h(this.f24411a, OMSTemplateType.dialog);
        }
    }

    public LoveLetterUserItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39595a() {
    }

    private int getRootHeight() {
        return (int) (((double) ((t100.m186889c().widthPixels - t100.f167268q) / 2)) * 1.333d);
    }

    /* JADX INFO: renamed from: d */
    public final void m39598d(View view) {
        scw.m183430a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m39599e(e30 e30Var, hcw hcwVar, String str, j760 j760Var) {
        User user = (User) j760Var.f116564a;
        this.f24408j = user;
        this.f24409k = (Conversation) j760Var.f116565b;
        if (user.isBanedOrInactivated() || TEnum.equals(this.f24409k.status, "dismissed") || TEnum.equals(this.f24409k.status, "blocked") || TEnum.equals(this.f24409k.status, "deleted")) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(this.f24408j.f56011id);
                return;
            }
            return;
        }
        qib0.f154691G.m102335N0(this.f24400b, this.f24408j.m60124fp().maxWidth(480).formatted(), false);
        String strConcat = "";
        this.f24410l = "";
        if (this.f24408j.isIdAndPicBothVerified()) {
            xdl0.m208344M(this.f24402d, true);
            this.f24402d.setBackgroundResource(x2c0.f190461pi);
            xdl0.m208327D0(t100.f167240O, this.f24402d);
            this.f24410l = "实名·头像本人";
        } else {
            boolean zIsPicVerificationVerified = this.f24408j.isPicVerificationVerified();
            View view = this.f24402d;
            if (zIsPicVerificationVerified) {
                xdl0.m208344M(view, true);
                this.f24402d.setBackgroundResource(x2c0.f190429oi);
                xdl0.m208327D0(t100.m186890d(67.0f), this.f24402d);
                this.f24410l = "头像本人";
            } else {
                xdl0.m208344M(view, false);
            }
        }
        ConvAdditionalLoveLetter convAdditionalLoveLetter = this.f24409k.additional.loveLetter;
        if (convAdditionalLoveLetter == null || vwb.m200296J(convAdditionalLoveLetter.suggestTags)) {
            xdl0.m208344M(this.f24401c, false);
        } else {
            ConvAdditionalLoveLetterTag convAdditionalLoveLetterTag = this.f24409k.additional.loveLetter.suggestTags.get(0);
            xdl0.m208344M(this.f24401c, true);
            this.f24401c.setText(convAdditionalLoveLetterTag.tag);
            boolean zIsEmpty = TextUtils.isEmpty(this.f24410l);
            String str2 = convAdditionalLoveLetterTag.tag;
            if (!zIsEmpty) {
                str2 = Constants.SEPARATOR_COMMA + str2;
            }
            this.f24410l += str2;
        }
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(this.f24408j.f56011id);
        boolean zIsEmpty2 = TextUtils.isEmpty(strM169561y7);
        VText vText = this.f24405g;
        if (zIsEmpty2) {
            vText.setText(this.f24408j.name);
        } else {
            vText.setText(strM169561y7);
        }
        this.f24406h.setText(String.valueOf(this.f24408j.age));
        xdl0.m208344M(this.f24406h, !this.f24408j.isHideAgeFromSVip());
        boolean zIsHideLocationFromSVip = this.f24408j.isHideLocationFromSVip();
        boolean zIsHideActiveFromSVip = this.f24408j.isHideActiveFromSVip();
        if (zIsHideLocationFromSVip && zIsHideActiveFromSVip) {
            xdl0.m208344M(this.f24407i, false);
        } else {
            xdl0.m208344M(this.f24407i, true);
            if (zIsHideActiveFromSVip || !CoreModule.f17545c.f19588N0.m31967k3(this.f24408j, 5)) {
                this.f24407i.setCompoundDrawables(null, null, null, null);
            } else {
                Drawable drawable = getContext().getDrawable(x2c0.f190749yi);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f24407i.setCompoundDrawables(drawable, null, null, null);
                strConcat = "在线";
            }
            if (!zIsHideLocationFromSVip) {
                if (!TextUtils.isEmpty(strConcat)) {
                    strConcat = strConcat.concat(" · ");
                }
                strConcat = strConcat + i0g0.m133876p(this.f24408j.location.distance, true);
            }
            boolean zIsEmpty3 = TextUtils.isEmpty(strConcat);
            VText vText2 = this.f24407i;
            if (zIsEmpty3) {
                xdl0.m208344M(vText2, false);
            } else {
                vText2.setText(strConcat);
            }
        }
        boolean zSuperLikedMe = this.f24408j.superLikedMe();
        FrameLayout frameLayout = this.f24403e;
        if (zSuperLikedMe) {
            frameLayout.setBackgroundResource(x2c0.f189796Ug);
            xdl0.m208325C0(this.f24403e, (getRootHeight() * t100.m186890d(57.0f)) / t100.m186890d(234.0f));
        } else {
            frameLayout.setBackgroundResource(x2c0.f189950Zf);
            xdl0.m208325C0(this.f24403e, (getRootHeight() * t100.m186890d(108.0f)) / t100.m186890d(234.0f));
        }
        zvf0.m220368A("e_user_card", hcwVar.pageId(), new j760("to_uid", str), new j760("card_tag", this.f24410l));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m39600f(hcw hcwVar, String str, View view) {
        zvf0.m220399u("e_user_card", hcwVar.pageId(), new j760("to_uid", str), new j760("card_tag", this.f24410l));
        if (CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified()) {
            hcwVar.mo130521R(str);
        } else if (TEnum.equals(CoreModule.f17545c.f19552B0.m31620s4(), "pending")) {
            lsi0.m151595y("请稍后，正在审核中。");
        } else {
            Act act = hcwVar.act();
            CoreDlg.m44987G1(act, "请先完成头像本人认证", "认证真实也是表达真诚的一部分，诚意满满的情书更动人", x2c0.f190611u8, "去认证", new C8086a(act), true, "以后再说", new d30() { // from class: l.rcw
                @Override // p149l.d30
                public final void call() {
                    LoveLetterUserItem.m39595a();
                }
            }, null, null, true, false, null, null, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m39601g(dac0<C8087a.b> dac0Var, final hcw hcwVar, final String str, final e30<String> e30Var, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dac0Var.mo67374c(hcwVar.act(), mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(str), CoreModule.f17545c.f19642f0.m32737Ne(str), new gm20())).subscribe(mkd0.m154955G(new e30() { // from class: l.pcw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148235a.m39599e(e30Var, hcwVar, str, (j760) obj);
            }
        }));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.qcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153843a.m39600f(hcwVar, str, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39598d(this);
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

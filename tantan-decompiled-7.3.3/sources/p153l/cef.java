package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4900o;
import com.p051p1.mobile.putong.core.data.LabelData;
import com.p051p1.mobile.putong.core.data.MbtiInfo;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.view.CardLabelShowView3;
import com.p051p1.mobile.putong.data.CharacterEvaluate;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cef extends AbstractC8802c {

    /* JADX INFO: renamed from: A */
    public SimpleDraweeView f81345A;

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f81346u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f81347v;

    /* JADX INFO: renamed from: w */
    public VLinear f81348w;

    /* JADX INFO: renamed from: x */
    public VText f81349x;

    /* JADX INFO: renamed from: y */
    public VText f81350y;

    /* JADX INFO: renamed from: z */
    public CardLabelShowView3 f81351z;

    /* JADX INFO: renamed from: l.cef$a */
    public class ViewOnClickListenerC16239a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean[] f81352a;

        public ViewOnClickListenerC16239a(boolean[] zArr) {
            this.f81352a = zArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = CoreModule.f18264c.f20381e0.m116600p9().profile.extensions.basic.mbti.get(0);
            aw90.m100562F().f73703c = false;
            this.f81352a[0] = true;
            cef.this.m52355x().act().startActivity(MkWebViewAct.m81423g2(cef.this.m52355x().act(), "", tr90.f175820n + str + "&uid=" + CoreModule.m30929H().userId(), true, true, true, true, null));
        }
    }

    public cef(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ Boolean m109361S(boolean[] zArr, C4470c c4470c) {
        boolean z = false;
        if (c4470c == C4470c.f16267i && zArr[0] && aw90.m100562F().f73703c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m109365W(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m109366X(boolean[] zArr, String str, View view) {
        sfj0.m185596c("e_test_mbti", "p_edit_profile_view", new sfj0.C20032a[0]);
        aw90.m100562F().f73703c = false;
        zArr[0] = true;
        m52355x().act().startActivity(MkWebViewAct.m81423g2(m52355x().act(), "", str, true, true, true, true, null));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m109367Y(CharacterEvaluate characterEvaluate, View view) {
        C4900o.m35347r3(m52355x().act(), m52355x().m189086i2(), C4900o.m35348s3(C4900o.f20810T, m52355x().userId(), characterEvaluate.hideCharacter, "my_profile"));
    }

    /* JADX INFO: renamed from: Z */
    public void m109368Z(String str) {
        MbtiInfo mbtiInfoM196132a = uhx.m196132a(str);
        if (NullChecker.m82487b(mbtiInfoM196132a)) {
            this.f81349x.setText(String.format("%s%s", mbtiInfoM196132a.key, mbtiInfoM196132a.character));
            this.f81350y.setText(mbtiInfoM196132a.desc);
            uqb0.f180374G.m127115L0(this.f81345A, mbtiInfoM196132a.pic);
            ArrayList arrayList = new ArrayList();
            for (String str2 : mbtiInfoM196132a.labels) {
                LabelData labelData = new LabelData();
                labelData.name = str2;
                arrayList.add(labelData);
            }
            this.f81351z.setTestKey(ProfileLikeType.mbti);
            this.f81351z.setLabel(arrayList);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的社交性格";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return FirebaseAnalytics.Param.CHARACTER;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f81346u = expEditItemView;
        expEditItemView.m52012d("我的MBTI", dbc0.f87429st);
        VLinear vLinear = (VLinear) LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f126078u2, (ViewGroup) null);
        this.f81348w = vLinear;
        vLinear.setPadding(0, qa00.f156318e, 0, 0);
        bnl0.m105524M(this.f81348w, false);
        this.f81345A = (SimpleDraweeView) this.f81348w.findViewById(adc0.f70319e8);
        this.f81349x = (VText) this.f81348w.findViewById(adc0.f70353g8);
        this.f81350y = (VText) this.f81348w.findViewById(adc0.f70302d8);
        this.f81351z = (CardLabelShowView3) this.f81348w.findViewById(adc0.f70336f8);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f81347v = expEditItemView2;
        expEditItemView2.m52012d("内在性格测试", dbc0.f87363qt);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f81346u);
        linearLayout.addView(this.f81348w);
        linearLayout.addView(this.f81347v.getDividerView());
        linearLayout.addView(this.f81347v);
        return linearLayout;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        final boolean[] zArr = {false};
        boolean zM100564Q = aw90.m100564Q(CoreModule.f18264c.f20381e0.m116593na());
        ExpEditItemView expEditItemView = this.f81346u;
        if (zM100564Q) {
            expEditItemView.m52011c("", 2);
            bnl0.m105524M(this.f81348w, true);
            ViewOnClickListenerC16239a viewOnClickListenerC16239a = new ViewOnClickListenerC16239a(zArr);
            bnl0.m105509E0(this.f81348w, viewOnClickListenerC16239a);
            bnl0.m105509E0(this.f81346u, viewOnClickListenerC16239a);
            m109368Z(m52355x().m189086i2().profile.extensions.basic.mbti.get(0));
        } else {
            expEditItemView.m52011c("添加", 1);
            bnl0.m105524M(this.f81348w, false);
            final String str = String.format(tr90.f175821o, "edit_profile");
            bnl0.m105509E0(this.f81346u, new View.OnClickListener() { // from class: l.xdf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f193585a.m109366X(zArr, str, view);
                }
            });
        }
        final CharacterEvaluate characterEvaluate = CoreModule.f18264c.f20381e0.f89110R.get().characterEvaluate;
        if (characterEvaluate == null || TextUtils.isEmpty(characterEvaluate.classification)) {
            bnl0.m105524M(this.f81347v, false);
            bnl0.m105524M(this.f81347v.getDividerView(), false);
        } else {
            bnl0.m105509E0(this.f81347v, new View.OnClickListener() { // from class: l.ydf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f198596a.m109367Y(characterEvaluate, view);
                }
            });
        }
        m52355x().lifecycle().filter(new qcj() { // from class: l.zdf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cef.m109361S(zArr, (C4470c) obj);
            }
        }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.aef
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            }
        }, new y20() { // from class: l.bef
            @Override // p153l.y20
            public final void call(Object obj) {
                cef.m109365W((Throwable) obj);
            }
        }));
    }
}

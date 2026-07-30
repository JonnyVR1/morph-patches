package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4749o;
import com.p046p1.mobile.putong.core.data.LabelData;
import com.p046p1.mobile.putong.core.data.MbtiInfo;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.view.CardLabelShowView3;
import com.p046p1.mobile.putong.data.CharacterEvaluate;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wcf extends AbstractC8639c {

    /* JADX INFO: renamed from: A */
    public SimpleDraweeView f185679A;

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f185680u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f185681v;

    /* JADX INFO: renamed from: w */
    public VLinear f185682w;

    /* JADX INFO: renamed from: x */
    public VText f185683x;

    /* JADX INFO: renamed from: y */
    public VText f185684y;

    /* JADX INFO: renamed from: z */
    public CardLabelShowView3 f185685z;

    /* JADX INFO: renamed from: l.wcf$a */
    public class ViewOnClickListenerC20849a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean[] f185686a;

        public ViewOnClickListenerC20849a(boolean[] zArr) {
            this.f185686a = zArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.basic.mbti.get(0);
            wn90.m204602F().f187271c = false;
            this.f185686a[0] = true;
            wcf.this.m51172x().act().startActivity(MkWebViewAct.m80240e2(wcf.this.m51172x().act(), "", pj90.f149726n + str + "&uid=" + CoreModule.m29931H().userId(), true, true, true, true, null));
        }
    }

    public wcf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ Boolean m202656S(boolean[] zArr, C4319c c4319c) {
        boolean z = false;
        if (c4319c == C4319c.f15548i && zArr[0] && wn90.m204602F().f187271c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m202660W(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m202661X(boolean[] zArr, String str, View view) {
        o6j0.m162859c("e_test_mbti", "p_edit_profile_view", new o6j0.C18854a[0]);
        wn90.m204602F().f187271c = false;
        zArr[0] = true;
        m51172x().act().startActivity(MkWebViewAct.m80240e2(m51172x().act(), "", str, true, true, true, true, null));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m202662Y(CharacterEvaluate characterEvaluate, View view) {
        C4749o.m34344r3(m51172x().act(), m51172x().m94569i2(), C4749o.m34345s3(C4749o.f20068T, m51172x().userId(), characterEvaluate.hideCharacter, "my_profile"));
    }

    /* JADX INFO: renamed from: Z */
    public void m202663Z(String str) {
        MbtiInfo mbtiInfoM198262a = vex.m198262a(str);
        if (NullChecker.m81304b(mbtiInfoM198262a)) {
            this.f185683x.setText(String.format("%s%s", mbtiInfoM198262a.key, mbtiInfoM198262a.character));
            this.f185684y.setText(mbtiInfoM198262a.desc);
            qib0.f154691G.m102331L0(this.f185679A, mbtiInfoM198262a.pic);
            ArrayList arrayList = new ArrayList();
            for (String str2 : mbtiInfoM198262a.labels) {
                LabelData labelData = new LabelData();
                labelData.name = str2;
                arrayList.add(labelData);
            }
            this.f185685z.setTestKey(ProfileLikeType.mbti);
            this.f185685z.setLabel(arrayList);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的社交性格";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return FirebaseAnalytics.Param.CHARACTER;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f185680u = expEditItemView;
        expEditItemView.m50829d("我的MBTI", x2c0.f189278Ds);
        VLinear vLinear = (VLinear) LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96024u2, (ViewGroup) null);
        this.f185682w = vLinear;
        vLinear.setPadding(0, t100.f167256e, 0, 0);
        xdl0.m208344M(this.f185682w, false);
        this.f185679A = (SimpleDraweeView) this.f185682w.findViewById(u4c0.f174194c8);
        this.f185683x = (VText) this.f185682w.findViewById(u4c0.f174228e8);
        this.f185684y = (VText) this.f185682w.findViewById(u4c0.f174177b8);
        this.f185685z = (CardLabelShowView3) this.f185682w.findViewById(u4c0.f174211d8);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f185681v = expEditItemView2;
        expEditItemView2.m50829d("内在性格测试", x2c0.f189214Bs);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f185680u);
        linearLayout.addView(this.f185682w);
        linearLayout.addView(this.f185681v.getDividerView());
        linearLayout.addView(this.f185681v);
        return linearLayout;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        final boolean[] zArr = {false};
        boolean zM204604Q = wn90.m204604Q(CoreModule.f17545c.f19639e0.m169520na());
        ExpEditItemView expEditItemView = this.f185680u;
        if (zM204604Q) {
            expEditItemView.m50828c("", 2);
            xdl0.m208344M(this.f185682w, true);
            ViewOnClickListenerC20849a viewOnClickListenerC20849a = new ViewOnClickListenerC20849a(zArr);
            xdl0.m208329E0(this.f185682w, viewOnClickListenerC20849a);
            xdl0.m208329E0(this.f185680u, viewOnClickListenerC20849a);
            m202663Z(m51172x().m94569i2().profile.extensions.basic.mbti.get(0));
        } else {
            expEditItemView.m50828c("添加", 1);
            xdl0.m208344M(this.f185682w, false);
            final String str = String.format(pj90.f149727o, "edit_profile");
            xdl0.m208329E0(this.f185680u, new View.OnClickListener() { // from class: l.rcf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f158766a.m202661X(zArr, str, view);
                }
            });
        }
        final CharacterEvaluate characterEvaluate = CoreModule.f17545c.f19639e0.f149253R.get().characterEvaluate;
        if (characterEvaluate == null || TextUtils.isEmpty(characterEvaluate.classification)) {
            xdl0.m208344M(this.f185681v, false);
            xdl0.m208344M(this.f185681v.getDividerView(), false);
        } else {
            xdl0.m208329E0(this.f185681v, new View.OnClickListener() { // from class: l.scf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f163725a.m202662Y(characterEvaluate, view);
                }
            });
        }
        m51172x().lifecycle().filter(new w9j() { // from class: l.tcf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return wcf.m202656S(zArr, (C4319c) obj);
            }
        }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.ucf
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            }
        }, new e30() { // from class: l.vcf
            @Override // p149l.e30
            public final void call(Object obj) {
                wcf.m202660W((Throwable) obj);
            }
        }));
    }
}

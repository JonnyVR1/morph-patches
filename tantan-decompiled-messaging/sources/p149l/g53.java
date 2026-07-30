package p149l;

import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.generic.RoundingParams;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageReference;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.DetectText;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VPager;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class g53 {

    /* JADX INFO: renamed from: a */
    public Act f100600a;

    /* JADX INFO: renamed from: b */
    public BottomSheetDialog f100601b;

    /* JADX INFO: renamed from: c */
    public VEditText f100602c;

    /* JADX INFO: renamed from: d */
    public TextView f100603d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f100604e;

    /* JADX INFO: renamed from: f */
    public e30<Boolean> f100605f;

    /* JADX INFO: renamed from: g */
    public cwf0 f100606g;

    /* JADX INFO: renamed from: h */
    public c4g0 f100607h;

    /* JADX INFO: renamed from: i */
    public List<LiteraturesComments> f100608i;

    /* JADX INFO: renamed from: j */
    public List<String> f100609j;

    /* JADX INFO: renamed from: k */
    public int f100610k = 0;

    /* JADX INFO: renamed from: l */
    public C17002d f100611l;

    /* JADX INFO: renamed from: l.g53$c */
    public static class C17001c extends eb2 {

        /* JADX INFO: renamed from: e */
        public List<LiteraturesComments> f100615e;

        /* JADX INFO: renamed from: f */
        public List<String> f100616f;

        public C17001c(List<LiteraturesComments> list, List<String> list2) {
            this.f100615e = list;
            this.f100616f = list2;
        }

        @Override // p149l.w660
        public int getCount() {
            List<LiteraturesComments> list = this.f100615e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.m163037a(viewGroup.getContext()).inflate(f6c0.f95602V, viewGroup, false);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f174021Rf);
            TextView textView = (TextView) viewInflate.findViewById(u4c0.f174146Za);
            List<LiteraturesComments> list = this.f100615e;
            if (list != null && list.size() > i) {
                LiteraturesComments literaturesComments = this.f100615e.get(i);
                if (literaturesComments.localLiteratures != null) {
                    RoundingParams roundingParams = new RoundingParams();
                    roundingParams.m8264r(t100.m186890d(12.0f), t100.m186890d(12.0f), t100.m186890d(12.0f), t100.m186890d(12.0f));
                    if (TextUtils.equals(literaturesComments.localLiteratures.category, "book")) {
                        roundingParams.m8264r(t100.m186890d(2.0f), t100.m186890d(8.0f), t100.m186890d(8.0f), t100.m186890d(2.0f));
                    }
                    vDraweeView.getHierarchy().m112053H(roundingParams);
                    qib0.f154691G.m102331L0(vDraweeView, literaturesComments.localLiteratures.headUrl);
                }
            }
            List<String> list2 = this.f100616f;
            if (list2 != null && list2.size() > i) {
                textView.setText(this.f100616f.get(i));
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.g53$d */
    public static class C17002d {

        /* JADX INFO: renamed from: a */
        public String f100617a;

        /* JADX INFO: renamed from: b */
        public String f100618b;

        public C17002d(String str, String str2) {
            this.f100617a = str;
            this.f100618b = str2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m124444f(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m124448j(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m124455A(Act act) {
        this.f100602c.requestFocus();
        act.showInput(this.f100602c, 0);
        VEditText vEditText = this.f100602c;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m124456B(Boolean bool) {
        this.f100600a.progressDismiss();
        if (bool.booleanValue()) {
            osi0.m165783g("已发送");
            m124462q();
        } else {
            osi0.m165783g("发送失败");
        }
        e30<Boolean> e30Var = this.f100605f;
        if (e30Var != null) {
            e30Var.call(bool);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m124457C(Throwable th) {
        this.f100600a.progressDismiss();
        osi0.m165783g("发送失败");
        e30<Boolean> e30Var = this.f100605f;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m124458D(String str, String str2, String str3) {
        Message messageNew_ = Message.new_();
        messageNew_.value = str2;
        messageNew_.messageType = MessageType.get("literature");
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageNew_.api_only_reference = messageReferenceNew_;
        messageReferenceNew_.f20447id = str3;
        messageReferenceNew_.type = "literature";
        this.f100600a.duringCreated((C22306c) CoreModule.f17545c.f19642f0.m32649Fn(str, messageNew_, null, false, false).flatMap(new w9j() { // from class: l.d53
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m32650Fo();
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.e53
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89345a.m124465t((roj0) obj);
            }
        }, new e30() { // from class: l.f53
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94955a.m124466u((Throwable) obj);
            }
        }));
        this.f100607h = this.f100600a.duringCreated(CoreModule.f17545c.f19642f0.f19907W).subscribe(mkd0.m154956H(new e30() { // from class: l.t43
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167685a.m124464s((Throwable) obj);
            }
        }, new e30() { // from class: l.u43
            @Override // p149l.e30
            public final void call(Object obj) {
                g53.m124444f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public final void m124459E(final String str, final String str2, final String str3, final String str4, final boolean z) {
        if (!Network.isConnected(CoreModule.f17544b)) {
            lsi0.m151578h(R$string.f18813p4);
            return;
        }
        if (CoreModule.f17545c.f19639e0.m169527p9().isJailed()) {
            CoreModule.m29932K().startJailedDialogLikeAct();
            m124462q();
            e30<Boolean> e30Var = this.f100605f;
            if (e30Var != null) {
                e30Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        this.f100600a.progress(R$string.f17842J5);
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get("greeting");
        ArrayList arrayList = new ArrayList();
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = "greeting";
        detectTextNew_.value = str2;
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        this.f100600a.duringCreated(ya5.m213801Q(detectRequestNew_)).subscribe(mkd0.m154956H(new e30() { // from class: l.b53
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73432a.m124467v(z, str, str2, str4, str3, (Detect) obj);
            }
        }, new e30() { // from class: l.c53
            @Override // p149l.e30
            public final void call(Object obj) {
                g53.m124448j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public void m124460F(final Act act, final String str, String str2, final boolean z, List<LiteraturesComments> list, List<String> list2, C17002d c17002d, e30<Boolean> e30Var) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (act == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || list == null || list.isEmpty() || list2 == null || userM169527p9 == null || list2.isEmpty() || c17002d == null || list.size() != list2.size()) {
            return;
        }
        this.f100600a = act;
        ArrayList arrayList = new ArrayList();
        if (vwb.m200296J(list) || list.size() <= 5) {
            this.f100608i = list;
        } else {
            for (int i = 0; i < list.size() && i < 5; i++) {
                arrayList.add(list.get(i));
            }
            this.f100608i = arrayList;
        }
        this.f100609j = list2;
        this.f100605f = e30Var;
        this.f100611l = c17002d;
        this.f100601b = new BottomSheetDialog(act, v7c0.f180361h);
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95618W, (ViewGroup) null);
        int iMax = Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()) + t100.m186890d(70.0f);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(u4c0.f174478t4);
        this.f100604e = frameLayout;
        xdl0.m208325C0(frameLayout, iMax);
        this.f100601b.setContentView(viewInflate);
        viewInflate.findViewById(u4c0.f173786E1).setOnClickListener(new View.OnClickListener() { // from class: l.s43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162264a.m124468w(view);
            }
        });
        VEditText vEditText = (VEditText) viewInflate.findViewById(u4c0.f174358m3);
        this.f100602c = vEditText;
        vEditText.setText(upa.m194657K0());
        viewInflate.findViewById(u4c0.f174502ub).setOnClickListener(new View.OnClickListener() { // from class: l.x43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190937a.m124469x(view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174069Ud);
        this.f100603d = textView;
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.y43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195890a.m124470y(act, str, z, view);
            }
        });
        this.f100602c.addTextChangedListener(new C16999a(act));
        VPager vPager = (VPager) viewInflate.findViewById(u4c0.f174364m9);
        VPagerCircleIndicator vPagerCircleIndicator = (VPagerCircleIndicator) viewInflate.findViewById(u4c0.f174381n9);
        vPager.setAdapter(new C17001c(this.f100608i, list2));
        vPagerCircleIndicator.setViewPager(vPager);
        vPagerCircleIndicator.setOnPageChangeListener(new C17000b());
        this.f100601b.getBehavior().setState(3);
        this.f100601b.getBehavior().setSkipCollapsed(true);
        this.f100601b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.z43
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f201437a.m124471z(dialogInterface);
            }
        });
        this.f100601b.show();
        e51.m114743H(act, new Runnable() { // from class: l.a53
            @Override // java.lang.Runnable
            public final void run() {
                this.f67626a.m124455A(act);
            }
        }, 100L);
        cwf0 cwf0VarM133794c = i0e.m133794c("p_artwork_send_message", s4e.class.getName());
        this.f100606g = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(j760.m140076a("artwork_send_message_show_from", c17002d.f100617a), j760.m140076a("receiver_user_id", str));
        i0e.m133797f(this.f100606g);
    }

    /* JADX INFO: renamed from: G */
    public final void m124461G(String str, String str2, String str3, String str4) {
        this.f100600a.duringCreated(CoreModule.f17545c.f19582L0.m141020f3(str, str2, str3, str4)).subscribe(mkd0.m154956H(new e30() { // from class: l.v43
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179878a.m124456B((Boolean) obj);
            }
        }, new e30() { // from class: l.w43
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184471a.m124457C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final void m124462q() {
        if (NullChecker.m81303a(this.f100600a)) {
            this.f100600a.alwaysHideInput();
        }
        if (NullChecker.m81303a(this.f100601b)) {
            this.f100601b.dismiss();
        }
        if (NullChecker.m81303a(this.f100606g)) {
            i0e.m133796e(this.f100606g);
        }
        if (NullChecker.m81303a(this.f100607h)) {
            this.f100607h.unsubscribe();
        }
        this.f100601b = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX INFO: renamed from: r */
    public final void m124463r(Act act, String str, String str2, String str3, String str4, boolean z) {
        g53 g53Var;
        String str5;
        String strM208624b;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (qib0.f154711Z.m119125K(str2)) {
            act.dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20568z0();
            g53Var = this;
        } else {
            g53Var = this;
            g53Var.m124459E(str, str2, str3, str4, z);
        }
        if (NullChecker.m81303a(g53Var.f100611l)) {
            if (!NullChecker.m81303a(g53Var.f100608i) || g53Var.f100608i.isEmpty()) {
                str5 = "";
                strM208624b = "";
            } else {
                int size = g53Var.f100608i.size();
                int i = g53Var.f100610k;
                if (size <= i || !NullChecker.m81303a(g53Var.f100608i.get(i).localLiteratures)) {
                    str5 = "";
                    strM208624b = "";
                } else {
                    str5 = g53Var.f100608i.get(g53Var.f100610k).localLiteratures.title;
                    strM208624b = xgc0.m208624b(g53Var.f100608i.get(g53Var.f100610k).localLiteratures);
                }
            }
            zvf0.m220399u("e_artwork_send_message_button", "p_artwork_send_message", vwb.m200311Y("artwork_title", str5), vwb.m200311Y("artwork_type", strM208624b), vwb.m200311Y("artwork_status", g53Var.f100611l.f100618b));
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m124464s(Throwable th) {
        this.f100600a.progressDismiss();
        osi0.m165783g("发送失败");
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m124465t(roj0 roj0Var) {
        this.f100600a.progressDismiss();
        osi0.m165783g("已发送");
        e30<Boolean> e30Var = this.f100605f;
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
        m124462q();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m124466u(Throwable th) {
        this.f100600a.progressDismiss();
        osi0.m165783g("发送失败");
        e30<Boolean> e30Var = this.f100605f;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m124467v(boolean z, String str, String str2, String str3, String str4, Detect detect) {
        if (!NullChecker.m81303a(detect.text) || detect.text.size() <= 0) {
            if (z) {
                m124458D(str, str2, str3);
                return;
            } else {
                m124461G(str, str2, str4, str3);
                return;
            }
        }
        this.f100600a.progressDismiss();
        if (AntiSpamHelper.m80266a(detect, "p_artwork_send_message")) {
            lsi0.m151593w(R$string.f18409c0);
        } else {
            osi0.m165783g(this.f100600a.getString(R$string.f17844J7));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m124468w(View view) {
        m124462q();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m124469x(View view) {
        this.f100602c.setText(upa.m194657K0());
        VEditText vEditText = this.f100602c;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m124470y(Act act, String str, boolean z, View view) {
        int size = this.f100608i.size();
        int i = this.f100610k;
        if (size > i) {
            LiteraturesComments literaturesComments = this.f100608i.get(i);
            m124463r(act, str, this.f100602c.getText().toString().trim(), literaturesComments.f20434id, literaturesComments.literatureID, z);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m124471z(DialogInterface dialogInterface) {
        m124462q();
    }

    /* JADX INFO: renamed from: l.g53$b */
    public class C17000b implements ViewPager.InterfaceC0716j {
        public C17000b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            g53.this.f100610k = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.g53$a */
    public class C16999a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f100612a;

        public C16999a(Act act) {
            this.f100612a = act;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            g53 g53Var = g53.this;
            if (zIsEmpty) {
                g53Var.f100603d.setTextColor(this.f100612a.getResources().getColor(w0c0.f183821Y));
                g53.this.f100603d.setBackground(this.f100612a.getResources().getDrawable(x2c0.f189509L8));
            } else {
                g53Var.f100603d.setTextColor(this.f100612a.getResources().getColor(w0c0.f183788N));
                g53.this.f100603d.setBackground(this.f100612a.getResources().getDrawable(x2c0.f189540M8));
            }
            g53.this.f100603d.setEnabled(!editable.toString().trim().isEmpty());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

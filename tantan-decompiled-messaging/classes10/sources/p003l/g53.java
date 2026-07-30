package p003l;

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
import com.p000p1.mobile.putong.core.data.Greeting;
import com.p000p1.mobile.putong.core.data.LiteraturesComments;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.MessageReference;
import com.p000p1.mobile.putong.core.data.MessageType;
import com.p000p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Detect;
import com.p1.mobile.putong.data.DetectCategoryType;
import com.p1.mobile.putong.data.DetectRequest;
import com.p1.mobile.putong.data.DetectText;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c4g0;
import l.cwf0;
import l.e30;
import l.e51;
import l.eb2;
import l.f6c0;
import l.i0e;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.o7r;
import l.osi0;
import l.qib0;
import l.roj0;
import l.t100;
import l.u4c0;
import l.upa;
import l.v7c0;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.ya5;
import l.zvf0;
import v.VDraweeView;
import v.VEditText;
import v.VPager;
import v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g53 {

    /* JADX INFO: renamed from: a */
    public Act f4545a;

    /* JADX INFO: renamed from: b */
    public BottomSheetDialog f4546b;

    /* JADX INFO: renamed from: c */
    public VEditText f4547c;

    /* JADX INFO: renamed from: d */
    public TextView f4548d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f4549e;

    /* JADX INFO: renamed from: f */
    public e30<Boolean> f4550f;

    /* JADX INFO: renamed from: g */
    public cwf0 f4551g;

    /* JADX INFO: renamed from: h */
    public c4g0 f4552h;

    /* JADX INFO: renamed from: i */
    public List<LiteraturesComments> f4553i;

    /* JADX INFO: renamed from: j */
    public List<String> f4554j;

    /* JADX INFO: renamed from: k */
    public int f4555k = 0;

    /* JADX INFO: renamed from: l */
    public C3332d f4556l;

    /* JADX INFO: renamed from: l.g53$c */
    public static class C3331c extends eb2 {

        /* JADX INFO: renamed from: e */
        public List<LiteraturesComments> f4560e;

        /* JADX INFO: renamed from: f */
        public List<String> f4561f;

        public C3331c(List<LiteraturesComments> list, List<String> list2) {
            this.f4560e = list;
            this.f4561f = list2;
        }

        public int getCount() {
            List<LiteraturesComments> list = this.f4560e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m6579o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* JADX INFO: renamed from: p */
        public Object m6580p(ViewGroup viewGroup, int i) {
            View viewInflate = o7r.a(viewGroup.getContext()).inflate(f6c0.V, viewGroup, false);
            VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.Rf);
            TextView textView = (TextView) viewInflate.findViewById(u4c0.Za);
            List<LiteraturesComments> list = this.f4560e;
            if (list != null && list.size() > i) {
                LiteraturesComments literaturesComments = this.f4560e.get(i);
                if (literaturesComments.localLiteratures != null) {
                    RoundingParams roundingParams = new RoundingParams();
                    roundingParams.r(t100.d(12.0f), t100.d(12.0f), t100.d(12.0f), t100.d(12.0f));
                    if (TextUtils.equals(literaturesComments.localLiteratures.category, "book")) {
                        roundingParams.r(t100.d(2.0f), t100.d(8.0f), t100.d(8.0f), t100.d(2.0f));
                    }
                    vDraweeViewFindViewById.getHierarchy().H(roundingParams);
                    qib0.G.L0(vDraweeViewFindViewById, literaturesComments.localLiteratures.headUrl);
                }
            }
            List<String> list2 = this.f4561f;
            if (list2 != null && list2.size() > i) {
                textView.setText(this.f4561f.get(i));
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.g53$d */
    public static class C3332d {

        /* JADX INFO: renamed from: a */
        public String f4562a;

        /* JADX INFO: renamed from: b */
        public String f4563b;

        public C3332d(String str, String str2) {
            this.f4562a = str;
            this.f4563b = str2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m6551f(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m6555j(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m6562A(Act act) {
        this.f4547c.requestFocus();
        act.showInput(this.f4547c, 0);
        VEditText vEditText = this.f4547c;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m6563B(Boolean bool) {
        this.f4545a.progressDismiss();
        if (bool.booleanValue()) {
            osi0.g("已发送");
            m6569q();
        } else {
            osi0.g("发送失败");
        }
        e30<Boolean> e30Var = this.f4550f;
        if (e30Var != null) {
            e30Var.call(bool);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m6564C(Throwable th) {
        this.f4545a.progressDismiss();
        osi0.g("发送失败");
        e30<Boolean> e30Var = this.f4550f;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m6565D(String str, String str2, String str3) {
        Message messageNew_ = Message.new_();
        messageNew_.value = str2;
        messageNew_.messageType = MessageType.get("literature");
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageNew_.api_only_reference = messageReferenceNew_;
        messageReferenceNew_.f109id = str3;
        messageReferenceNew_.type = "literature";
        this.f4545a.duringCreated(CoreModule.c.f0.Fn(str, messageNew_, (Sticker) null, false, false).flatMap(new w9j() { // from class: l.d53
            public final Object call(Object obj) {
                return CoreModule.c.f0.Fo();
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.e53
            public final void call(Object obj) {
                this.f4256a.m6572t((roj0) obj);
            }
        }, new e30() { // from class: l.f53
            public final void call(Object obj) {
                this.f4387a.m6573u((Throwable) obj);
            }
        }));
        this.f4552h = this.f4545a.duringCreated(CoreModule.c.f0.W).subscribe(mkd0.H(new e30() { // from class: l.t43
            public final void call(Object obj) {
                this.f7505a.m6571s((Throwable) obj);
            }
        }, new e30() { // from class: l.u43
            public final void call(Object obj) {
                g53.m6551f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public final void m6566E(final String str, final String str2, final String str3, final String str4, final boolean z) {
        if (!Network.isConnected(CoreModule.b)) {
            lsi0.h(R.string.p4);
            return;
        }
        if (CoreModule.c.e0.p9().isJailed()) {
            CoreModule.K().startJailedDialogLikeAct();
            m6569q();
            e30<Boolean> e30Var = this.f4550f;
            if (e30Var != null) {
                e30Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        this.f4545a.progress(R.string.J5);
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get(Greeting.TYPE);
        ArrayList arrayList = new ArrayList();
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = Greeting.TYPE;
        detectTextNew_.value = str2;
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        this.f4545a.duringCreated(ya5.Q(detectRequestNew_)).subscribe(mkd0.H(new e30() { // from class: l.b53
            public final void call(Object obj) {
                this.f3324a.m6574v(z, str, str2, str4, str3, (Detect) obj);
            }
        }, new e30() { // from class: l.c53
            public final void call(Object obj) {
                g53.m6555j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public void m6567F(final Act act, final String str, String str2, final boolean z, List<LiteraturesComments> list, List<String> list2, C3332d c3332d, e30<Boolean> e30Var) {
        User userP9 = CoreModule.c.e0.p9();
        if (act == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || list == null || list.isEmpty() || list2 == null || userP9 == null || list2.isEmpty() || c3332d == null || list.size() != list2.size()) {
            return;
        }
        this.f4545a = act;
        ArrayList arrayList = new ArrayList();
        if (vwb.J(list) || list.size() <= 5) {
            this.f4553i = list;
        } else {
            for (int i = 0; i < list.size() && i < 5; i++) {
                arrayList.add(list.get(i));
            }
            this.f4553i = arrayList;
        }
        this.f4554j = list2;
        this.f4550f = e30Var;
        this.f4556l = c3332d;
        this.f4546b = new BottomSheetDialog(act, v7c0.h);
        View viewInflate = o7r.a(act).inflate(f6c0.W, (ViewGroup) null);
        int iMax = Math.max(((Integer) Act.savedKeyboardHeight.get()).intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()) + t100.d(70.0f);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(u4c0.t4);
        this.f4549e = frameLayout;
        xdl0.C0(frameLayout, iMax);
        this.f4546b.setContentView(viewInflate);
        viewInflate.findViewById(u4c0.E1).setOnClickListener(new View.OnClickListener() { // from class: l.s43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7271a.m6575w(view);
            }
        });
        VEditText vEditTextFindViewById = viewInflate.findViewById(u4c0.m3);
        this.f4547c = vEditTextFindViewById;
        vEditTextFindViewById.setText(upa.K0());
        viewInflate.findViewById(u4c0.ub).setOnClickListener(new View.OnClickListener() { // from class: l.x43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8301a.m6576x(view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(u4c0.Ud);
        this.f4548d = textView;
        xdl0.E0(textView, new View.OnClickListener() { // from class: l.y43
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8640a.m6577y(act, str, z, view);
            }
        });
        this.f4547c.addTextChangedListener(new C3329a(act));
        VPager vPagerFindViewById = viewInflate.findViewById(u4c0.m9);
        VPagerCircleIndicator vPagerCircleIndicatorFindViewById = viewInflate.findViewById(u4c0.n9);
        vPagerFindViewById.setAdapter(new C3331c(this.f4553i, list2));
        vPagerCircleIndicatorFindViewById.setViewPager(vPagerFindViewById);
        vPagerCircleIndicatorFindViewById.setOnPageChangeListener(new C3330b());
        this.f4546b.getBehavior().setState(3);
        this.f4546b.getBehavior().setSkipCollapsed(true);
        this.f4546b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.z43
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f9185a.m6578z(dialogInterface);
            }
        });
        this.f4546b.show();
        e51.H(act, new Runnable() { // from class: l.a53
            @Override // java.lang.Runnable
            public final void run() {
                this.f2729a.m6562A(act);
            }
        }, 100L);
        cwf0 cwf0VarC = i0e.c("p_artwork_send_message", s4e.class.getName());
        this.f4551g = cwf0VarC;
        cwf0VarC.p(new j760[]{j760.a("artwork_send_message_show_from", c3332d.f4562a), j760.a("receiver_user_id", str)});
        i0e.f(this.f4551g);
    }

    /* JADX INFO: renamed from: G */
    public final void m6568G(String str, String str2, String str3, String str4) {
        this.f4545a.duringCreated(CoreModule.c.L0.f3(str, str2, str3, str4)).subscribe(mkd0.H(new e30() { // from class: l.v43
            public final void call(Object obj) {
                this.f7861a.m6563B((Boolean) obj);
            }
        }, new e30() { // from class: l.w43
            public final void call(Object obj) {
                this.f8119a.m6564C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final void m6569q() {
        if (NullChecker.a(this.f4545a)) {
            this.f4545a.alwaysHideInput();
        }
        if (NullChecker.a(this.f4546b)) {
            this.f4546b.dismiss();
        }
        if (NullChecker.a(this.f4551g)) {
            i0e.e(this.f4551g);
        }
        if (NullChecker.a(this.f4552h)) {
            this.f4552h.unsubscribe();
        }
        this.f4546b = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX INFO: renamed from: r */
    public final void m6570r(Act act, String str, String str2, String str3, String str4, boolean z) {
        g53 g53Var;
        String str5;
        String strM10796b;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (qib0.Z.K(str2)) {
            act.dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).z0();
            g53Var = this;
        } else {
            g53Var = this;
            g53Var.m6566E(str, str2, str3, str4, z);
        }
        if (NullChecker.a(g53Var.f4556l)) {
            if (!NullChecker.a(g53Var.f4553i) || g53Var.f4553i.isEmpty()) {
                str5 = "";
                strM10796b = "";
            } else {
                int size = g53Var.f4553i.size();
                int i = g53Var.f4555k;
                if (size <= i || !NullChecker.a(g53Var.f4553i.get(i).localLiteratures)) {
                    str5 = "";
                    strM10796b = "";
                } else {
                    str5 = g53Var.f4553i.get(g53Var.f4555k).localLiteratures.title;
                    strM10796b = xgc0.m10796b(g53Var.f4553i.get(g53Var.f4555k).localLiteratures);
                }
            }
            zvf0.u("e_artwork_send_message_button", "p_artwork_send_message", new j760[]{vwb.Y("artwork_title", str5), vwb.Y("artwork_type", strM10796b), vwb.Y("artwork_status", g53Var.f4556l.f4563b)});
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m6571s(Throwable th) {
        this.f4545a.progressDismiss();
        osi0.g("发送失败");
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m6572t(roj0 roj0Var) {
        this.f4545a.progressDismiss();
        osi0.g("已发送");
        e30<Boolean> e30Var = this.f4550f;
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
        m6569q();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m6573u(Throwable th) {
        this.f4545a.progressDismiss();
        osi0.g("发送失败");
        e30<Boolean> e30Var = this.f4550f;
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m6574v(boolean z, String str, String str2, String str3, String str4, Detect detect) {
        if (!NullChecker.a(detect.text) || detect.text.size() <= 0) {
            if (z) {
                m6565D(str, str2, str3);
                return;
            } else {
                m6568G(str, str2, str4, str3);
                return;
            }
        }
        this.f4545a.progressDismiss();
        if (AntiSpamHelper.a(detect, "p_artwork_send_message")) {
            lsi0.w(R.string.c0);
        } else {
            osi0.g(this.f4545a.getString(R.string.J7));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m6575w(View view) {
        m6569q();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m6576x(View view) {
        this.f4547c.setText(upa.K0());
        VEditText vEditText = this.f4547c;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m6577y(Act act, String str, boolean z, View view) {
        int size = this.f4553i.size();
        int i = this.f4555k;
        if (size > i) {
            LiteraturesComments literaturesComments = this.f4553i.get(i);
            m6570r(act, str, this.f4547c.getText().toString().trim(), literaturesComments.f96id, literaturesComments.literatureID, z);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m6578z(DialogInterface dialogInterface) {
        m6569q();
    }

    /* JADX INFO: renamed from: l.g53$b */
    public class C3330b implements ViewPager.j {
        public C3330b() {
        }

        public void onPageSelected(int i) {
            g53.this.f4555k = i;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.g53$a */
    public class C3329a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f4557a;

        public C3329a(Act act) {
            this.f4557a = act;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            g53 g53Var = g53.this;
            if (zIsEmpty) {
                g53Var.f4548d.setTextColor(this.f4557a.getResources().getColor(w0c0.Y));
                g53.this.f4548d.setBackground(this.f4557a.getResources().getDrawable(x2c0.L8));
            } else {
                g53Var.f4548d.setTextColor(this.f4557a.getResources().getColor(w0c0.N));
                g53.this.f4548d.setBackground(this.f4557a.getResources().getDrawable(x2c0.M8));
            }
            g53.this.f4548d.setEnabled(!editable.toString().trim().isEmpty());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

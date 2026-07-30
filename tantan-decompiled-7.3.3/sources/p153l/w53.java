package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageReference;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.DetectText;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.util.AntiSpamHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VPager;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes12.dex */
public class w53 {

    /* JADX INFO: renamed from: a */
    public Act f187458a;

    /* JADX INFO: renamed from: b */
    public BottomSheetDialog f187459b;

    /* JADX INFO: renamed from: c */
    public VEditText f187460c;

    /* JADX INFO: renamed from: d */
    public TextView f187461d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f187462e;

    /* JADX INFO: renamed from: f */
    public y20<Boolean> f187463f;

    /* JADX INFO: renamed from: g */
    public l4g0 f187464g;

    /* JADX INFO: renamed from: h */
    public kcg0 f187465h;

    /* JADX INFO: renamed from: i */
    public List<LiteraturesComments> f187466i;

    /* JADX INFO: renamed from: j */
    public List<String> f187467j;

    /* JADX INFO: renamed from: k */
    public int f187468k = 0;

    /* JADX INFO: renamed from: l */
    public C21023d f187469l;

    /* JADX INFO: renamed from: l.w53$c */
    public static class C21022c extends lb2 {

        /* JADX INFO: renamed from: e */
        public List<LiteraturesComments> f187473e;

        /* JADX INFO: renamed from: f */
        public List<String> f187474f;

        public C21022c(List<LiteraturesComments> list, List<String> list2) {
            this.f187473e = list;
            this.f187474f = list2;
        }

        @Override // p153l.cf60
        public int getCount() {
            List<LiteraturesComments> list = this.f187473e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            View viewInflate = p9r.m171370a(viewGroup.getContext()).inflate(kec0.f125656V, viewGroup, false);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70160Uf);
            TextView textView = (TextView) viewInflate.findViewById(adc0.f70271bb);
            List<LiteraturesComments> list = this.f187473e;
            if (list != null && list.size() > i) {
                LiteraturesComments literaturesComments = this.f187473e.get(i);
                if (literaturesComments.localLiteratures != null) {
                    RoundingParams roundingParams = new RoundingParams();
                    roundingParams.m8318r(qa00.m175859d(12.0f), qa00.m175859d(12.0f), qa00.m175859d(12.0f), qa00.m175859d(12.0f));
                    if (TextUtils.equals(literaturesComments.localLiteratures.category, "book")) {
                        roundingParams.m8318r(qa00.m175859d(2.0f), qa00.m175859d(8.0f), qa00.m175859d(8.0f), qa00.m175859d(2.0f));
                    }
                    vDraweeView.getHierarchy().m207045H(roundingParams);
                    uqb0.f180374G.m127115L0(vDraweeView, literaturesComments.localLiteratures.headUrl);
                }
            }
            List<String> list2 = this.f187474f;
            if (list2 != null && list2.size() > i) {
                textView.setText(this.f187474f.get(i));
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }
    }

    /* JADX INFO: renamed from: l.w53$d */
    public static class C21023d {

        /* JADX INFO: renamed from: a */
        public String f187475a;

        /* JADX INFO: renamed from: b */
        public String f187476b;

        public C21023d(String str, String str2) {
            this.f187475a = str;
            this.f187476b = str2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m204927f(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m204931j(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m204938A(Act act) {
        this.f187460c.requestFocus();
        act.showInput(this.f187460c, 0);
        VEditText vEditText = this.f187460c;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m204939B(Boolean bool) {
        this.f187458a.progressDismiss();
        if (bool.booleanValue()) {
            r1j0.m179420g("已发送");
            m204945q();
        } else {
            r1j0.m179420g("发送失败");
        }
        y20<Boolean> y20Var = this.f187463f;
        if (y20Var != null) {
            y20Var.call(bool);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m204940C(Throwable th) {
        this.f187458a.progressDismiss();
        r1j0.m179420g("发送失败");
        y20<Boolean> y20Var = this.f187463f;
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m204941D(String str, String str2, String str3) {
        Message messageNew_ = Message.new_();
        messageNew_.value = str2;
        messageNew_.messageType = MessageType.get("literature");
        MessageReference messageReferenceNew_ = MessageReference.new_();
        messageNew_.api_only_reference = messageReferenceNew_;
        messageReferenceNew_.f21189id = str3;
        messageReferenceNew_.type = "literature";
        this.f187458a.duringCreated((C22421c) CoreModule.f18264c.f20384f0.m33652Fn(str, messageNew_, null, false, false).flatMap(new qcj() { // from class: l.t53
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m33653Fo();
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.u53
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177576a.m204948t((uxj0) obj);
            }
        }, new y20() { // from class: l.v53
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182474a.m204949u((Throwable) obj);
            }
        }));
        this.f187465h = this.f187458a.duringCreated(CoreModule.f18264c.f20384f0.f20649W).subscribe(psd0.m173597H(new y20() { // from class: l.j53
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118365a.m204947s((Throwable) obj);
            }
        }, new y20() { // from class: l.k53
            @Override // p153l.y20
            public final void call(Object obj) {
                w53.m204927f((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public final void m204942E(final String str, final String str2, final String str3, final String str4, final boolean z) {
        if (!Network.isConnected(CoreModule.f18263b)) {
            o1j0.m165634h(R$string.f19605r4);
            return;
        }
        if (CoreModule.f18264c.f20381e0.m116600p9().isJailed()) {
            CoreModule.m30930K().startJailedDialogLikeAct();
            m204945q();
            y20<Boolean> y20Var = this.f187463f;
            if (y20Var != null) {
                y20Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        this.f187458a.progress(R$string.f18632L5);
        DetectRequest detectRequestNew_ = DetectRequest.new_();
        detectRequestNew_.category = DetectCategoryType.get("greeting");
        ArrayList arrayList = new ArrayList();
        DetectText detectTextNew_ = DetectText.new_();
        detectTextNew_.key = "greeting";
        detectTextNew_.value = str2;
        arrayList.add(detectTextNew_);
        detectRequestNew_.text = arrayList;
        this.f187458a.duringCreated(yb5.m214988Q(detectRequestNew_)).subscribe(psd0.m173597H(new y20() { // from class: l.r53
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161280a.m204950v(z, str, str2, str4, str3, (Detect) obj);
            }
        }, new y20() { // from class: l.s53
            @Override // p153l.y20
            public final void call(Object obj) {
                w53.m204931j((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: F */
    public void m204943F(final Act act, final String str, String str2, final boolean z, List<LiteraturesComments> list, List<String> list2, C21023d c21023d, y20<Boolean> y20Var) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (act == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || list == null || list.isEmpty() || list2 == null || userM116600p9 == null || list2.isEmpty() || c21023d == null || list.size() != list2.size()) {
            return;
        }
        this.f187458a = act;
        ArrayList arrayList = new ArrayList();
        if (jyb.m147479J(list) || list.size() <= 5) {
            this.f187466i = list;
        } else {
            for (int i = 0; i < list.size() && i < 5; i++) {
                arrayList.add(list.get(i));
            }
            this.f187466i = arrayList;
        }
        this.f187467j = list2;
        this.f187463f = y20Var;
        this.f187469l = c21023d;
        this.f187459b = new BottomSheetDialog(act, agc0.f71122h);
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125672W, (ViewGroup) null);
        int iMax = Math.max(Act.savedKeyboardHeight.get().intValue(), ((Integer) Act.savedKeyboardHeight.defaultValue()).intValue()) + qa00.m175859d(70.0f);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(adc0.f70603v4);
        this.f187462e = frameLayout;
        bnl0.m105505C0(frameLayout, iMax);
        this.f187459b.setContentView(viewInflate);
        viewInflate.findViewById(adc0.f69874E1).setOnClickListener(new View.OnClickListener() { // from class: l.i53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112995a.m204951w(view);
            }
        });
        VEditText vEditText = (VEditText) viewInflate.findViewById(adc0.f70483o3);
        this.f187460c = vEditText;
        vEditText.setText(gra.m131588K0());
        viewInflate.findViewById(adc0.f70627wb).setOnClickListener(new View.OnClickListener() { // from class: l.n53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140277a.m204952x(view);
            }
        });
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70208Xd);
        this.f187461d = textView;
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.o53
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145027a.m204953y(act, str, z, view);
            }
        });
        this.f187460c.addTextChangedListener(new C21020a(act));
        VPager vPager = (VPager) viewInflate.findViewById(adc0.f70489o9);
        VPagerCircleIndicator vPagerCircleIndicator = (VPagerCircleIndicator) viewInflate.findViewById(adc0.f70506p9);
        vPager.setAdapter(new C21022c(this.f187466i, list2));
        vPagerCircleIndicator.setViewPager(vPager);
        vPagerCircleIndicator.setOnPageChangeListener(new C21021b());
        this.f187459b.getBehavior().setState(3);
        this.f187459b.getBehavior().setSkipCollapsed(true);
        this.f187459b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.p53
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f150590a.m204954z(dialogInterface);
            }
        });
        this.f187459b.show();
        l51.m152888H(act, new Runnable() { // from class: l.q53
            @Override // java.lang.Runnable
            public final void run() {
                this.f155656a.m204938A(act);
            }
        }, 100L);
        l4g0 l4g0VarM204399c = w1e.m204399c("p_artwork_send_message", g6e.class.getName());
        this.f187464g = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(pf60.m172085a("artwork_send_message_show_from", c21023d.f187475a), pf60.m172085a("receiver_user_id", str));
        w1e.m204402f(this.f187464g);
    }

    /* JADX INFO: renamed from: G */
    public final void m204944G(String str, String str2, String str3, String str4) {
        this.f187458a.duringCreated(CoreModule.f18264c.f20324L0.m185527f3(str, str2, str3, str4)).subscribe(psd0.m173597H(new y20() { // from class: l.l53
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130064a.m204939B((Boolean) obj);
            }
        }, new y20() { // from class: l.m53
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134861a.m204940C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final void m204945q() {
        if (NullChecker.m82486a(this.f187458a)) {
            this.f187458a.alwaysHideInput();
        }
        if (NullChecker.m82486a(this.f187459b)) {
            this.f187459b.dismiss();
        }
        if (NullChecker.m82486a(this.f187464g)) {
            w1e.m204401e(this.f187464g);
        }
        if (NullChecker.m82486a(this.f187465h)) {
            this.f187465h.unsubscribe();
        }
        this.f187459b = null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    /* JADX INFO: renamed from: r */
    public final void m204946r(Act act, String str, String str2, String str3, String str4, boolean z) {
        w53 w53Var;
        String str5;
        String strM121847b;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (uqb0.f180394Z.m95954K(str2)) {
            act.dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21567z0();
            w53Var = this;
        } else {
            w53Var = this;
            w53Var.m204942E(str, str2, str3, str4, z);
        }
        if (NullChecker.m82486a(w53Var.f187469l)) {
            if (!NullChecker.m82486a(w53Var.f187466i) || w53Var.f187466i.isEmpty()) {
                str5 = "";
                strM121847b = "";
            } else {
                int size = w53Var.f187466i.size();
                int i = w53Var.f187468k;
                if (size <= i || !NullChecker.m82486a(w53Var.f187466i.get(i).localLiteratures)) {
                    str5 = "";
                    strM121847b = "";
                } else {
                    str5 = w53Var.f187466i.get(w53Var.f187468k).localLiteratures.title;
                    strM121847b = epc0.m121847b(w53Var.f187466i.get(w53Var.f187468k).localLiteratures);
                }
            }
            i4g0.m138523u("e_artwork_send_message_button", "p_artwork_send_message", jyb.m147494Y("artwork_title", str5), jyb.m147494Y("artwork_type", strM121847b), jyb.m147494Y("artwork_status", w53Var.f187469l.f187476b));
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m204947s(Throwable th) {
        this.f187458a.progressDismiss();
        r1j0.m179420g("发送失败");
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m204948t(uxj0 uxj0Var) {
        this.f187458a.progressDismiss();
        r1j0.m179420g("已发送");
        y20<Boolean> y20Var = this.f187463f;
        if (y20Var != null) {
            y20Var.call(Boolean.TRUE);
        }
        m204945q();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m204949u(Throwable th) {
        this.f187458a.progressDismiss();
        r1j0.m179420g("发送失败");
        y20<Boolean> y20Var = this.f187463f;
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m204950v(boolean z, String str, String str2, String str3, String str4, Detect detect) {
        if (!NullChecker.m82486a(detect.text) || detect.text.size() <= 0) {
            if (z) {
                m204941D(str, str2, str3);
                return;
            } else {
                m204944G(str, str2, str4, str3);
                return;
            }
        }
        this.f187458a.progressDismiss();
        if (AntiSpamHelper.m81449a(detect, "p_artwork_send_message")) {
            o1j0.m165649w(R$string.f19139c0);
        } else {
            r1j0.m179420g(this.f187458a.getString(R$string.f18634L7));
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m204951w(View view) {
        m204945q();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m204952x(View view) {
        this.f187460c.setText(gra.m131588K0());
        VEditText vEditText = this.f187460c;
        vEditText.setSelection(vEditText.getText().length());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m204953y(Act act, String str, boolean z, View view) {
        int size = this.f187466i.size();
        int i = this.f187468k;
        if (size > i) {
            LiteraturesComments literaturesComments = this.f187466i.get(i);
            m204946r(act, str, this.f187460c.getText().toString().trim(), literaturesComments.f21176id, literaturesComments.literatureID, z);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m204954z(DialogInterface dialogInterface) {
        m204945q();
    }

    /* JADX INFO: renamed from: l.w53$b */
    public class C21021b implements ViewPager.InterfaceC0718j {
        public C21021b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            w53.this.f187468k = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.w53$a */
    public class C21020a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f187470a;

        public C21020a(Act act) {
            this.f187470a = act;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean zIsEmpty = editable.toString().trim().isEmpty();
            w53 w53Var = w53.this;
            if (zIsEmpty) {
                w53Var.f187461d.setTextColor(this.f187470a.getResources().getColor(c9c0.f80393Z));
                w53.this.f187461d.setBackground(this.f187470a.getResources().getDrawable(dbc0.f86369M8));
            } else {
                w53Var.f187461d.setTextColor(this.f187470a.getResources().getColor(c9c0.f80357N));
                w53.this.f187461d.setBackground(this.f187470a.getResources().getDrawable(dbc0.f86401N8));
            }
            w53.this.f187461d.setEnabled(!editable.toString().trim().isEmpty());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

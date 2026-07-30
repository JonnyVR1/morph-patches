package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.Notification;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class bh4 implements iam<rg4> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f76713a;

    /* JADX INFO: renamed from: b */
    public VEditText f76714b;

    /* JADX INFO: renamed from: c */
    public VText f76715c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f76716d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f76717e;

    /* JADX INFO: renamed from: f */
    public VText f76718f;

    /* JADX INFO: renamed from: g */
    public VText f76719g;

    /* JADX INFO: renamed from: h */
    public final PutongAct f76720h;

    /* JADX INFO: renamed from: i */
    public rg4 f76721i;

    /* JADX INFO: renamed from: j */
    public MenuItem f76722j;

    /* JADX INFO: renamed from: k */
    public e90 f76723k;

    /* JADX INFO: renamed from: l */
    public TextView f76724l;

    /* JADX INFO: renamed from: m */
    public Dialog f76725m;

    /* JADX INFO: renamed from: n */
    public nlm f76726n = new nlm(this);

    /* JADX INFO: renamed from: o */
    public LinearLayoutManager f76727o;

    /* JADX INFO: renamed from: l.bh4$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC16009a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC16009a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            bh4.this.f76714b.requestFocus();
            bh4.this.f76714b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public bh4(PutongAct putongAct) {
        this.f76720h = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m104291A(View view) {
        if (this.f76723k == null) {
            this.f76723k = new e90(this);
            this.f76721i.m181324n0();
        }
        this.f76725m = getAct().dialog().m21546p(this.f76723k).m21525V(new DialogInterface.OnDismissListener() { // from class: l.zg4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f204254a.m104326y(dialogInterface);
            }
        }).m21567z0();
        this.f76721i.duringCreated(uqb0.f180370E.m80047p().take(3L, TimeUnit.SECONDS).materialize().first().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.ah4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71315a.m104327z((Notification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Media m104293b(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: n */
    private void m104300n(boolean z, TextView textView) {
        FeedModule.f39703d.m145587Pb().mo144666a(getAct(), textView, z);
        FeedModule.f39703d.m145587Pb().mo144669d(textView, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m104301x(CharSequence charSequence) {
        m104314O();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m104302B(x20 x20Var) {
        PutongAct act = getAct();
        Objects.requireNonNull(x20Var);
        act.postDelayed(new bri0(x20Var), 100L);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m104303C(TextView textView) {
        m104300n(m104321q(), textView);
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76720h;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m104304E() {
        this.f76721i.m181329t0();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: F */
    public LinearLayoutManager m104305F() {
        if (NullChecker.m82486a(this.f76727o)) {
            return this.f76727o;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getAct(), 0, false);
        this.f76727o = linearLayoutManager;
        return linearLayoutManager;
    }

    /* JADX INFO: renamed from: G */
    public void m104306G() {
        if (NullChecker.m82486a(this.f76725m)) {
            this.f76725m.dismiss();
        }
        o1j0.m165634h(R$string.f39918h3);
    }

    /* JADX INFO: renamed from: H */
    public void m104307H(final x20 x20Var) {
        if (this.f76714b.getText().toString().isEmpty() && this.f76721i.m181326p0()) {
            x20Var.call();
        } else {
            new mxg(getAct()).m160668j(R$string.f39737E3).m160662d(R$string.f39731D3).m160667i(R$string.f39983r, new Runnable() { // from class: l.wg4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f188909a.m104302B(x20Var);
                }
            }).m160665g(R$string.f39865a).show();
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m104308I(Menu menu) {
        this.f76722j = FeedModule.f39703d.m145587Pb().mo144671f(getAct(), menu);
        this.f76724l = FeedModule.f39703d.m145587Pb().mo144670e(getAct(), this.f76722j, new y20() { // from class: l.ug4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178854a.m104303C((TextView) obj);
            }
        });
        FeedModule.f39703d.m145587Pb().mo144676k(getAct(), this.f76722j, this.f76724l, new x20() { // from class: l.vg4
            @Override // p153l.x20
            public final void call() {
                this.f183997a.m104304E();
            }
        });
        m104314O();
        return true;
    }

    /* JADX INFO: renamed from: J */
    public rg4 m104309J() {
        return this.f76721i;
    }

    /* JADX INFO: renamed from: K */
    public void m104310K(String str) {
        this.f76714b.setText(str);
    }

    /* JADX INFO: renamed from: L */
    public void m104311L(MessageLocation messageLocation) {
        this.f76719g.setText(messageLocation.name);
    }

    /* JADX INFO: renamed from: M */
    public void m104312M(List<Media> list) {
        this.f76726n.m163742O(jyb.m147486Q(list, new qcj() { // from class: l.tg4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bh4.m104293b((Media) obj);
            }
        }));
        m104305F().scrollToPosition(this.f76726n.getItemCount() - 1);
        m104314O();
    }

    /* JADX INFO: renamed from: N */
    public void m104313N(String str) {
        if (NullChecker.m82486a(this.f76725m)) {
            this.f76725m.dismiss();
        }
        this.f76719g.setText(str);
    }

    /* JADX INFO: renamed from: O */
    public void m104314O() {
        if (NullChecker.m82486a(this.f76722j)) {
            this.f76722j.setEnabled(m104321q());
        }
        if (NullChecker.m82486a(this.f76724l)) {
            m104300n(m104321q(), this.f76724l);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m104315P(String str) {
        this.f76714b.setText(str);
    }

    /* JADX INFO: renamed from: Q */
    public void m104316Q() {
        e90 e90Var = this.f76723k;
        if (e90Var == null) {
            return;
        }
        e90Var.f92582d = true;
        e90Var.notifyDataSetChanged();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m104317k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m104317k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ch4.m109767b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public PutongAct getAct() {
        return this.f76720h;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rg4 rg4Var) {
        this.f76721i = rg4Var;
    }

    /* JADX INFO: renamed from: p */
    public String m104320p() {
        return this.f76714b.getText().toString();
    }

    /* JADX INFO: renamed from: q */
    public boolean m104321q() {
        return (!NullChecker.m82486a(this.f76715c) || this.f76715c.getVisibility() == 8) && !(this.f76721i.m181326p0() && TextUtils.isEmpty(NullChecker.m82486a(this.f76714b) ? this.f76714b.getText().toString().trim() : null));
    }

    /* JADX INFO: renamed from: s */
    public String m104322s() {
        return this.f76714b.getText().toString();
    }

    /* JADX INFO: renamed from: u */
    public void m104323u() {
        if (this.f76714b == null) {
            return;
        }
        getAct().hideInput(this.f76714b);
    }

    /* JADX INFO: renamed from: v */
    public void m104324v() {
        if (NullChecker.m82486a(this.f76725m)) {
            this.f76725m.dismiss();
        }
        this.f76721i.m181320i0();
        this.f76719g.setText((CharSequence) null);
    }

    /* JADX INFO: renamed from: w */
    public void m104325w(Bundle bundle) {
        getAct().setTitle(R$string.f39749G3);
        this.f76714b.setMaxLength(2000);
        this.f76714b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16009a());
        if (zt40.m221414b()) {
            Drawable drawable = getAct().getResources().getDrawable(lbc0.f131045g6);
            drawable.setBounds(0, 0, qa00.m175859d(16.0f), qa00.m175859d(16.0f));
            this.f76718f.setCompoundDrawables(drawable, null, null, null);
        } else {
            this.f76718f.setVisibility(8);
        }
        this.f76714b.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.xg4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194130a.m104301x((CharSequence) obj);
            }
        }));
        this.f76717e.setLayoutManager(m104305F());
        this.f76717e.setAdapter(this.f76726n);
        m104305F().scrollToPosition(this.f76726n.getItemCount() - 1);
        this.f76719g.setOnClickListener(new View.OnClickListener() { // from class: l.yg4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199699a.m104291A(view);
            }
        });
        this.f76714b.addTextChangedListener(new C16010b());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m104326y(DialogInterface dialogInterface) {
        this.f76725m = null;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m104327z(Notification notification) {
        if (notification.m222546k()) {
            this.f76721i.m181321j0((Location) notification.m222541f());
            return;
        }
        if (notification.m222544i() && NullChecker.m82486a(this.f76725m)) {
            try {
                this.f76725m.dismiss();
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("CaptionAct exception:" + e.getMessage(), e));
            }
            k3h.m148035E0(this.f76720h, 1);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.bh4$b */
    public class C16010b implements TextWatcher {
        public C16010b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strCall = bsj0.f78170j.call(editable);
            bh4 bh4Var = bh4.this;
            if (strCall == null) {
                bnl0.m105524M(bh4Var.f76715c, false);
                bh4.this.m104314O();
            } else {
                bh4Var.f76715c.setText(strCall);
                bnl0.m105525M0(bh4.this.f76715c, true);
                bh4.this.m104314O();
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

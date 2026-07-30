package p149l;

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
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p133rx.Notification;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class cg4 implements s7m<sf4> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f80700a;

    /* JADX INFO: renamed from: b */
    public VEditText f80701b;

    /* JADX INFO: renamed from: c */
    public VText f80702c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f80703d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f80704e;

    /* JADX INFO: renamed from: f */
    public VText f80705f;

    /* JADX INFO: renamed from: g */
    public VText f80706g;

    /* JADX INFO: renamed from: h */
    public final PutongAct f80707h;

    /* JADX INFO: renamed from: i */
    public sf4 f80708i;

    /* JADX INFO: renamed from: j */
    public MenuItem f80709j;

    /* JADX INFO: renamed from: k */
    public i90 f80710k;

    /* JADX INFO: renamed from: l */
    public TextView f80711l;

    /* JADX INFO: renamed from: m */
    public Dialog f80712m;

    /* JADX INFO: renamed from: n */
    public kjm f80713n = new kjm(this);

    /* JADX INFO: renamed from: o */
    public LinearLayoutManager f80714o;

    /* JADX INFO: renamed from: l.cg4$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC16126a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC16126a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            cg4.this.f80701b.requestFocus();
            cg4.this.f80701b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public cg4(PutongAct putongAct) {
        this.f80707h = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m106658A(View view) {
        if (this.f80710k == null) {
            this.f80710k = new i90(this);
            this.f80708i.m183787n0();
        }
        this.f80712m = getAct().dialog().m20547p(this.f80710k).m20526V(new DialogInterface.OnDismissListener() { // from class: l.ag4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f69259a.m106693y(dialogInterface);
            }
        }).m20568z0();
        this.f80708i.duringCreated(qib0.f154687E.m78864p().take(3L, TimeUnit.SECONDS).materialize().first().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.bg4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f75403a.m106694z((Notification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Media m106660b(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: n */
    private void m106667n(boolean z, TextView textView) {
        FeedModule.f38855d.m209346Pb().mo193129a(getAct(), textView, z);
        FeedModule.f38855d.m209346Pb().mo193132d(textView, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m106668x(CharSequence charSequence) {
        m106681O();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m106669B(d30 d30Var) {
        PutongAct act = getAct();
        Objects.requireNonNull(d30Var);
        act.postDelayed(new bii0(d30Var), 100L);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m106670C(TextView textView) {
        m106667n(m106688q(), textView);
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f80707h;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m106671E() {
        this.f80708i.m183792t0();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: F */
    public LinearLayoutManager m106672F() {
        if (NullChecker.m81303a(this.f80714o)) {
            return this.f80714o;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getAct(), 0, false);
        this.f80714o = linearLayoutManager;
        return linearLayoutManager;
    }

    /* JADX INFO: renamed from: G */
    public void m106673G() {
        if (NullChecker.m81303a(this.f80712m)) {
            this.f80712m.dismiss();
        }
        lsi0.m151578h(R$string.f39070h3);
    }

    /* JADX INFO: renamed from: H */
    public void m106674H(final d30 d30Var) {
        if (this.f80701b.getText().toString().isEmpty() && this.f80708i.m183789p0()) {
            d30Var.call();
        } else {
            new xvg(getAct()).m211291j(R$string.f38889E3).m211285d(R$string.f38883D3).m211290i(R$string.f39135r, new Runnable() { // from class: l.xf4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f192649a.m106669B(d30Var);
                }
            }).m211288g(R$string.f39017a).show();
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m106675I(Menu menu) {
        this.f80709j = FeedModule.f38855d.m209346Pb().mo193134f(getAct(), menu);
        this.f80711l = FeedModule.f38855d.m209346Pb().mo193133e(getAct(), this.f80709j, new e30() { // from class: l.vf4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181242a.m106670C((TextView) obj);
            }
        });
        FeedModule.f38855d.m209346Pb().mo193139k(getAct(), this.f80709j, this.f80711l, new d30() { // from class: l.wf4
            @Override // p149l.d30
            public final void call() {
                this.f186011a.m106671E();
            }
        });
        m106681O();
        return true;
    }

    /* JADX INFO: renamed from: J */
    public sf4 m106676J() {
        return this.f80708i;
    }

    /* JADX INFO: renamed from: K */
    public void m106677K(String str) {
        this.f80701b.setText(str);
    }

    /* JADX INFO: renamed from: L */
    public void m106678L(MessageLocation messageLocation) {
        this.f80706g.setText(messageLocation.name);
    }

    /* JADX INFO: renamed from: M */
    public void m106679M(List<Media> list) {
        this.f80713n.m146275O(vwb.m200303Q(list, new w9j() { // from class: l.uf4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return cg4.m106660b((Media) obj);
            }
        }));
        m106672F().scrollToPosition(this.f80713n.getItemCount() - 1);
        m106681O();
    }

    /* JADX INFO: renamed from: N */
    public void m106680N(String str) {
        if (NullChecker.m81303a(this.f80712m)) {
            this.f80712m.dismiss();
        }
        this.f80706g.setText(str);
    }

    /* JADX INFO: renamed from: O */
    public void m106681O() {
        if (NullChecker.m81303a(this.f80709j)) {
            this.f80709j.setEnabled(m106688q());
        }
        if (NullChecker.m81303a(this.f80711l)) {
            m106667n(m106688q(), this.f80711l);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m106682P(String str) {
        this.f80701b.setText(str);
    }

    /* JADX INFO: renamed from: Q */
    public void m106683Q() {
        i90 i90Var = this.f80710k;
        if (i90Var == null) {
            return;
        }
        i90Var.f112093d = true;
        i90Var.notifyDataSetChanged();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m106684k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m106684k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dg4.m111608b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public PutongAct getAct() {
        return this.f80707h;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sf4 sf4Var) {
        this.f80708i = sf4Var;
    }

    /* JADX INFO: renamed from: p */
    public String m106687p() {
        return this.f80701b.getText().toString();
    }

    /* JADX INFO: renamed from: q */
    public boolean m106688q() {
        return (!NullChecker.m81303a(this.f80702c) || this.f80702c.getVisibility() == 8) && !(this.f80708i.m183789p0() && TextUtils.isEmpty(NullChecker.m81303a(this.f80701b) ? this.f80701b.getText().toString().trim() : null));
    }

    /* JADX INFO: renamed from: s */
    public String m106689s() {
        return this.f80701b.getText().toString();
    }

    /* JADX INFO: renamed from: u */
    public void m106690u() {
        if (this.f80701b == null) {
            return;
        }
        getAct().hideInput(this.f80701b);
    }

    /* JADX INFO: renamed from: v */
    public void m106691v() {
        if (NullChecker.m81303a(this.f80712m)) {
            this.f80712m.dismiss();
        }
        this.f80708i.m183783i0();
        this.f80706g.setText((CharSequence) null);
    }

    /* JADX INFO: renamed from: w */
    public void m106692w(Bundle bundle) {
        getAct().setTitle(R$string.f38901G3);
        this.f80701b.setMaxLength(2000);
        this.f80701b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16126a());
        if (ll40.m150404b()) {
            Drawable drawable = getAct().getResources().getDrawable(f3c0.f94527g6);
            drawable.setBounds(0, 0, t100.m186890d(16.0f), t100.m186890d(16.0f));
            this.f80705f.setCompoundDrawables(drawable, null, null, null);
        } else {
            this.f80705f.setVisibility(8);
        }
        this.f80701b.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.yf4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197979a.m106668x((CharSequence) obj);
            }
        }));
        this.f80704e.setLayoutManager(m106672F());
        this.f80704e.setAdapter(this.f80713n);
        m106672F().scrollToPosition(this.f80713n.getItemCount() - 1);
        this.f80706g.setOnClickListener(new View.OnClickListener() { // from class: l.zf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202878a.m106658A(view);
            }
        });
        this.f80701b.addTextChangedListener(new C16127b());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m106693y(DialogInterface dialogInterface) {
        this.f80712m = null;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m106694z(Notification notification) {
        if (notification.m221300k()) {
            this.f80708i.m183784j0((Location) notification.m221295f());
            return;
        }
        if (notification.m221298i() && NullChecker.m81303a(this.f80712m)) {
            try {
                this.f80712m.dismiss();
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("CaptionAct exception:" + e.getMessage(), e));
            }
            v1h.m196558E0(this.f80707h, 1);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.cg4$b */
    public class C16127b implements TextWatcher {
        public C16127b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strCall = yij0.f198513j.call(editable);
            cg4 cg4Var = cg4.this;
            if (strCall == null) {
                xdl0.m208344M(cg4Var.f80702c, false);
                cg4.this.m106681O();
            } else {
                cg4Var.f80702c.setText(strCall);
                xdl0.m208345M0(cg4.this.f80702c, true);
                cg4.this.m106681O();
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

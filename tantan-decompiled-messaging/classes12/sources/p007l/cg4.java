package p007l;

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
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l.bii0;
import l.d30;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.s7m;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.yij0;
import rx.Notification;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cg4 implements s7m<sf4> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f6622a;

    /* JADX INFO: renamed from: b */
    public VEditText f6623b;

    /* JADX INFO: renamed from: c */
    public VText f6624c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f6625d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f6626e;

    /* JADX INFO: renamed from: f */
    public VText f6627f;

    /* JADX INFO: renamed from: g */
    public VText f6628g;

    /* JADX INFO: renamed from: h */
    public final PutongAct f6629h;

    /* JADX INFO: renamed from: i */
    public sf4 f6630i;

    /* JADX INFO: renamed from: j */
    public MenuItem f6631j;

    /* JADX INFO: renamed from: k */
    public i90 f6632k;

    /* JADX INFO: renamed from: l */
    public TextView f6633l;

    /* JADX INFO: renamed from: m */
    public Dialog f6634m;

    /* JADX INFO: renamed from: n */
    public kjm f6635n = new kjm(this);

    /* JADX INFO: renamed from: o */
    public LinearLayoutManager f6636o;

    /* JADX INFO: renamed from: l.cg4$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC2352a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC2352a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            cg4.this.f6623b.requestFocus();
            cg4.this.f6623b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public cg4(PutongAct putongAct) {
        this.f6629h = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m9131A(View view) {
        if (this.f6632k == null) {
            this.f6632k = new i90(this);
            this.f6630i.m14138n0();
        }
        this.f6634m = act().dialog().p(this.f6632k).V(new DialogInterface.OnDismissListener() { // from class: l.ag4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f5732a.m9168y(dialogInterface);
            }
        }).z0();
        this.f6630i.duringCreated(qib0.E.p().take(3L, TimeUnit.SECONDS).materialize().first().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.bg4
            public final void call(Object obj) {
                this.f6288a.m9169z((Notification) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Media m9133b(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: n */
    private void m9140n(boolean z, TextView textView) {
        FeedModule.f316d.m16527Pb().mo15074a(act(), textView, z);
        FeedModule.f316d.m16527Pb().mo15077d(textView, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m9141x(CharSequence charSequence) {
        m9155O();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m9142B(d30 d30Var) {
        PutongAct putongActAct = act();
        Objects.requireNonNull(d30Var);
        putongActAct.postDelayed(new bii0(d30Var), 100L);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m9143C(TextView textView) {
        m9140n(m9163q(), textView);
    }

    @NonNull
    /* JADX INFO: renamed from: C0 */
    public Context m9144C0() {
        return this.f6629h;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m9145E() {
        this.f6630i.m14143t0();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: F */
    public LinearLayoutManager m9146F() {
        if (NullChecker.a(this.f6636o)) {
            return this.f6636o;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act(), 0, false);
        this.f6636o = linearLayoutManager;
        return linearLayoutManager;
    }

    /* JADX INFO: renamed from: G */
    public void m9147G() {
        if (NullChecker.a(this.f6634m)) {
            this.f6634m.dismiss();
        }
        lsi0.h(R$string.f531h3);
    }

    /* JADX INFO: renamed from: H */
    public void m9148H(final d30 d30Var) {
        if (this.f6623b.getText().toString().isEmpty() && this.f6630i.m14140p0()) {
            d30Var.call();
        } else {
            new xvg(act()).m16864j(R$string.f350E3).m16858d(R$string.f344D3).m16863i(R$string.f596r, new Runnable() { // from class: l.xf4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14882a.m9142B(d30Var);
                }
            }).m16861g(R$string.f478a).show();
        }
    }

    /* JADX INFO: renamed from: I */
    public boolean m9149I(Menu menu) {
        this.f6631j = FeedModule.f316d.m16527Pb().mo15079f(act(), menu);
        this.f6633l = FeedModule.f316d.m16527Pb().mo15078e(act(), this.f6631j, new e30() { // from class: l.vf4
            public final void call(Object obj) {
                this.f14160a.m9143C((TextView) obj);
            }
        });
        FeedModule.f316d.m16527Pb().mo15084k(act(), this.f6631j, this.f6633l, new d30() { // from class: l.wf4
            public final void call() {
                this.f14530a.m9145E();
            }
        });
        m9155O();
        return true;
    }

    /* JADX INFO: renamed from: J */
    public sf4 m9150J() {
        return this.f6630i;
    }

    /* JADX INFO: renamed from: K */
    public void m9151K(String str) {
        this.f6623b.setText(str);
    }

    /* JADX INFO: renamed from: L */
    public void m9152L(MessageLocation messageLocation) {
        this.f6628g.setText(messageLocation.name);
    }

    /* JADX INFO: renamed from: M */
    public void m9153M(List<Media> list) {
        this.f6635n.m11490O(vwb.Q(list, new w9j() { // from class: l.uf4
            public final Object call(Object obj) {
                return cg4.m9133b((Media) obj);
            }
        }));
        m9146F().scrollToPosition(this.f6635n.getItemCount() - 1);
        m9155O();
    }

    /* JADX INFO: renamed from: N */
    public void m9154N(String str) {
        if (NullChecker.a(this.f6634m)) {
            this.f6634m.dismiss();
        }
        this.f6628g.setText(str);
    }

    /* JADX INFO: renamed from: O */
    public void m9155O() {
        if (NullChecker.a(this.f6631j)) {
            this.f6631j.setEnabled(m9163q());
        }
        if (NullChecker.a(this.f6633l)) {
            m9140n(m9163q(), this.f6633l);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m9156P(String str) {
        this.f6623b.setText(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.BaseAdapter, l.i90] */
    /* JADX INFO: renamed from: Q */
    public void m9157Q() {
        ?? r1 = this.f6632k;
        if (r1 == 0) {
            return;
        }
        r1.f8966d = true;
        r1.notifyDataSetChanged();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m9159k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m9159k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dg4.m9371b(this, layoutInflater, viewGroup);
    }

    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public PutongAct act() {
        return this.f6629h;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m9158i1(sf4 sf4Var) {
        this.f6630i = sf4Var;
    }

    /* JADX INFO: renamed from: p */
    public String m9162p() {
        return this.f6623b.getText().toString();
    }

    /* JADX INFO: renamed from: q */
    public boolean m9163q() {
        return (!NullChecker.a(this.f6624c) || this.f6624c.getVisibility() == 8) && !(this.f6630i.m14140p0() && TextUtils.isEmpty(NullChecker.a(this.f6623b) ? this.f6623b.getText().toString().trim() : null));
    }

    /* JADX INFO: renamed from: s */
    public String m9164s() {
        return this.f6623b.getText().toString();
    }

    /* JADX INFO: renamed from: u */
    public void m9165u() {
        if (this.f6623b == null) {
            return;
        }
        act().hideInput(this.f6623b);
    }

    /* JADX INFO: renamed from: v */
    public void m9166v() {
        if (NullChecker.a(this.f6634m)) {
            this.f6634m.dismiss();
        }
        this.f6630i.m14134i0();
        this.f6628g.setText(null);
    }

    /* JADX INFO: renamed from: w */
    public void m9167w(Bundle bundle) {
        act().setTitle(R$string.f362G3);
        this.f6623b.setMaxLength(2000);
        this.f6623b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2352a());
        if (ll40.m11640b()) {
            Drawable drawable = act().getResources().getDrawable(f3c0.f7810g6);
            drawable.setBounds(0, 0, t100.d(16.0f), t100.d(16.0f));
            this.f6627f.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.f6627f.setVisibility(8);
        }
        this.f6623b.h().subscribe(mkd0.G(new e30() { // from class: l.yf4
            public final void call(Object obj) {
                this.f15413a.m9141x((CharSequence) obj);
            }
        }));
        this.f6626e.setLayoutManager(m9146F());
        this.f6626e.setAdapter(this.f6635n);
        m9146F().scrollToPosition(this.f6635n.getItemCount() - 1);
        this.f6628g.setOnClickListener(new View.OnClickListener() { // from class: l.zf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15722a.m9131A(view);
            }
        });
        this.f6623b.addTextChangedListener(new C2353b());
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m9168y(DialogInterface dialogInterface) {
        this.f6634m = null;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m9169z(Notification notification) {
        if (notification.k()) {
            this.f6630i.m14135j0((Location) notification.f());
            return;
        }
        if (notification.i() && NullChecker.a(this.f6634m)) {
            try {
                this.f6634m.dismiss();
            } catch (Exception e) {
                CrashHelper.c(new Exception("CaptionAct exception:" + e.getMessage(), e));
            }
            v1h.m15197E0(this.f6629h, 1);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.cg4$b */
    public class C2353b implements TextWatcher {
        public C2353b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String str = (String) yij0.j.call(editable);
            cg4 cg4Var = cg4.this;
            if (str == null) {
                xdl0.M(cg4Var.f6624c, false);
                cg4.this.m9155O();
            } else {
                cg4Var.f6624c.setText(str);
                xdl0.M0(cg4.this.f6624c, true);
                cg4.this.m9155O();
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

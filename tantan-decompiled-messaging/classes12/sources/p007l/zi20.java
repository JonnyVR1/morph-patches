package p007l;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.mediapicker.EditTextInScrollView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.yij0;
import rx.Notification;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zi20 implements fyl, s7m<ki20> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f15753a;

    /* JADX INFO: renamed from: b */
    public EditTextInScrollView f15754b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f15755c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f15756d;

    /* JADX INFO: renamed from: e */
    public VText f15757e;

    /* JADX INFO: renamed from: f */
    public VText f15758f;

    /* JADX INFO: renamed from: g */
    public View f15759g;

    /* JADX INFO: renamed from: h */
    public VText f15760h;

    /* JADX INFO: renamed from: j */
    public od80 f15762j;

    /* JADX INFO: renamed from: k */
    public MessageLocation f15763k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f15764l;

    /* JADX INFO: renamed from: m */
    public p90 f15765m;

    /* JADX INFO: renamed from: n */
    public PutongAct f15766n;

    /* JADX INFO: renamed from: o */
    public ki20 f15767o;

    /* JADX INFO: renamed from: q */
    public j90 f15769q;

    /* JADX INFO: renamed from: r */
    public Dialog f15770r;

    /* JADX INFO: renamed from: i */
    public ArrayList<String> f15761i = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f15768p = new ViewOnClickListenerC2550a();

    /* JADX INFO: renamed from: s */
    public eml.InterfaceC2379a f15771s = new C2551b();

    /* JADX INFO: renamed from: t */
    public boolean f15772t = false;

    /* JADX INFO: renamed from: l.zi20$a */
    public class ViewOnClickListenerC2550a implements View.OnClickListener {
        public ViewOnClickListenerC2550a() {
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m17427e() {
            if (NullChecker.a(zi20.this.f15770r)) {
                zi20.this.f15770r.dismiss();
            }
            zi20.this.f15763k = null;
            zi20.this.f15758f.setText(null);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m17428f(k90 k90Var) {
            if (NullChecker.a(zi20.this.f15770r)) {
                zi20.this.f15770r.dismiss();
            }
            zi20.this.f15763k = new MessageLocation();
            zi20.this.f15763k.name = k90Var.m11398c();
            zi20.this.f15763k.address = k90Var.m11396a();
            zi20.this.f15763k.coordinates = k90Var.m11397b();
            zi20 zi20Var = zi20.this;
            zi20Var.f15758f.setText(zi20Var.f15763k.name);
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m17429g(DialogInterface dialogInterface) {
            zi20.this.f15770r = null;
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m17430h(Notification notification) {
            if (notification.k()) {
                zi20.this.f15765m.mo9600a((Location) notification.f(), zi20.this.f15766n);
                return;
            }
            if (notification.i() && NullChecker.a(zi20.this.f15770r)) {
                try {
                    zi20.this.f15770r.dismiss();
                } catch (Exception e) {
                    CrashHelper.c(new Exception("NewCaptionAct exception:" + e.getMessage(), e));
                }
                zi20 zi20Var = zi20.this;
                PutongAct putongAct = zi20Var.f15766n;
                ki20 ki20Var = zi20Var.f15767o;
                v1h.m15197E0(putongAct, 1);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zi20 zi20Var = zi20.this;
            if (zi20Var.f15769q == null) {
                zi20Var.f15769q = new j90(zi20.this.f15766n);
                zi20.this.f15769q.m11097B(new Runnable() { // from class: l.vi20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14172a.m17427e();
                    }
                });
                zi20.this.f15769q.m11098C(new e30() { // from class: l.wi20
                    public final void call(Object obj) {
                        this.f14549a.m17428f((k90) obj);
                    }
                });
                zi20.this.f15765m.init();
            }
            zi20 zi20Var2 = zi20.this;
            zi20Var2.f15770r = zi20Var2.f15766n.dialog().p(zi20.this.f15769q).V(new DialogInterface.OnDismissListener() { // from class: l.xi20
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f14906a.m17429g(dialogInterface);
                }
            }).z0();
            zi20.this.f15767o.duringCreated(qib0.E.p().take(3L, TimeUnit.SECONDS).materialize().first().observeOn(jo0.a())).subscribe(mkd0.G(new e30() { // from class: l.yi20
                public final void call(Object obj) {
                    this.f15440a.m17430h((Notification) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l.zi20$b */
    public class C2551b implements eml.InterfaceC2379a {
        public C2551b() {
        }

        @Override // p007l.eml.InterfaceC2379a
        /* JADX INFO: renamed from: a */
        public void mo9933a(List<k90> list) {
            if (NullChecker.b(zi20.this.f15769q)) {
                zi20.this.f15769q.m11096A(list, true);
            }
        }

        @Override // p007l.eml.InterfaceC2379a
        public void onError(Throwable th) {
            if (NullChecker.a(zi20.this.f15770r)) {
                zi20.this.f15770r.dismiss();
            }
            lsi0.n(R$string.f442U);
        }
    }

    public zi20(PutongAct putongAct) {
        this.f15766n = putongAct;
    }

    /* JADX INFO: renamed from: r */
    private void m17406r() {
        this.f15754b.setMaxLength(GivenGiftBrief.ADVANCED_GIFT_LEVEL);
        if (!ll40.m11640b()) {
            this.f15757e.setVisibility(8);
            return;
        }
        Drawable drawable = this.f15766n.getResources().getDrawable(f3c0.f7810g6);
        drawable.setBounds(0, 0, t100.d(16.0f), t100.d(16.0f));
        this.f15757e.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17407C0() {
        return this.f15766n;
    }

    @Override // p007l.fyl
    /* JADX INFO: renamed from: a */
    public void mo3893a() {
        this.f15767o.m11435o0();
    }

    @Nullable
    public Act act() {
        return this.f15766n;
    }

    public void destroy() {
        if (NullChecker.a(this.f15765m)) {
            this.f15765m.destroy();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM17409j = m17409j(layoutInflater, viewGroup);
        m17406r();
        return viewM17409j;
    }

    /* JADX INFO: renamed from: j */
    public View m17409j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aj20.m8578b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m17410k() {
        new k(new C2553d()).g(this.f15756d);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m17408i1(ki20 ki20Var) {
        this.f15767o = ki20Var;
    }

    /* JADX INFO: renamed from: m */
    public MessageLocation m17412m() {
        return this.f15763k;
    }

    /* JADX INFO: renamed from: n */
    public String m17413n() {
        return this.f15754b.getText().toString();
    }

    /* JADX INFO: renamed from: p */
    public boolean m17414p() {
        return this.f15760h.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: q */
    public boolean m17415q() {
        return !m17413n().trim().isEmpty();
    }

    /* JADX INFO: renamed from: s */
    public void m17416s(PutongAct putongAct) {
        putongAct.hideInput(this.f15754b);
    }

    /* JADX INFO: renamed from: u */
    public void m17417u() {
        this.f15754b.h().subscribe(mkd0.G(new e30() { // from class: l.ti20
            public final void call(Object obj) {
                this.f13306a.m17418v((CharSequence) obj);
            }
        }));
        this.f15762j = new od80(this.f15766n, this, true, null);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f15766n, 3);
        this.f15764l = gridLayoutManager;
        this.f15756d.setLayoutManager(gridLayoutManager);
        this.f15756d.setAdapter(this.f15762j);
        this.f15764l.scrollToPosition(this.f15762j.getItemCount() - 1);
        this.f15762j.m12534H(this.f15767o.m11426f0());
        this.f15765m = new p90(this.f15771s);
        xdl0.E0(this.f15758f, this.f15768p);
        this.f15754b.addTextChangedListener(new C2552c());
        m17410k();
        this.f15754b.post(new Runnable() { // from class: l.ui20
            @Override // java.lang.Runnable
            public final void run() {
                this.f13839a.m17419w();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m17418v(CharSequence charSequence) {
        this.f15767o.m11435o0();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m17419w() {
        this.f15754b.requestFocus();
    }

    /* JADX INFO: renamed from: x */
    public void m17420x(ArrayList<Media> arrayList) {
        od80 od80Var = this.f15762j;
        if (od80Var == null || arrayList == null) {
            return;
        }
        od80Var.m12534H(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public void m17421y(ArrayList<Media> arrayList) {
        od80 od80Var = this.f15762j;
        if (od80Var == null || arrayList == null) {
            return;
        }
        od80Var.m12534H(arrayList);
        this.f15764l.scrollToPosition(this.f15762j.getItemCount() - 1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: z */
    public void m17422z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15754b.setText(str);
        this.f15754b.setSelection(str.length());
    }

    /* JADX INFO: renamed from: l.zi20$d */
    public class C2553d extends k.e {
        public C2553d() {
        }

        /* JADX INFO: renamed from: k */
        public int m17432k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            int itemViewType = d0Var.getItemViewType();
            od80 unused = zi20.this.f15762j;
            if (itemViewType != 0) {
                return 0;
            }
            return k.e.t(15, 0);
        }

        /* JADX INFO: renamed from: y */
        public boolean m17433y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            int adapterPosition = d0Var.getAdapterPosition();
            int adapterPosition2 = d0Var2.getAdapterPosition();
            if (adapterPosition < adapterPosition2) {
                int i = adapterPosition;
                while (i < adapterPosition2) {
                    int i2 = i + 1;
                    if (i2 >= zi20.this.f15767o.m11426f0().size()) {
                        break;
                    }
                    Collections.swap(zi20.this.f15767o.m11426f0(), i, i2);
                    i = i2;
                }
            } else {
                for (int i3 = adapterPosition; i3 > adapterPosition2 && i3 > 0; i3--) {
                    Collections.swap(zi20.this.f15767o.m11426f0(), i3, i3 - 1);
                }
            }
            zi20.this.f15762j.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        /* JADX INFO: renamed from: B */
        public void m17431B(RecyclerView.d0 d0Var, int i) {
        }
    }

    /* JADX INFO: renamed from: l.zi20$c */
    public class C2552c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public int f15775a = 0;

        /* JADX INFO: renamed from: b */
        public int f15776b = 0;

        /* JADX INFO: renamed from: c */
        public int f15777c = 0;

        /* JADX INFO: renamed from: d */
        public int f15778d = 0;

        public C2552c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String str = (String) yij0.j.call(editable);
            zi20 zi20Var = zi20.this;
            if (str == null) {
                xdl0.M(zi20Var.f15760h, false);
                zi20.this.f15767o.m11435o0();
            } else {
                zi20Var.f15760h.setText(str);
                xdl0.M0(zi20.this.f15760h, true);
                zi20.this.f15767o.m11435o0();
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

package p149l;

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
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.EditTextInScrollView;
import com.p046p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.Notification;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class zi20 implements fyl, s7m<ki20> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f203252a;

    /* JADX INFO: renamed from: b */
    public EditTextInScrollView f203253b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f203254c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f203255d;

    /* JADX INFO: renamed from: e */
    public VText f203256e;

    /* JADX INFO: renamed from: f */
    public VText f203257f;

    /* JADX INFO: renamed from: g */
    public View f203258g;

    /* JADX INFO: renamed from: h */
    public VText f203259h;

    /* JADX INFO: renamed from: j */
    public od80 f203261j;

    /* JADX INFO: renamed from: k */
    public MessageLocation f203262k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f203263l;

    /* JADX INFO: renamed from: m */
    public p90 f203264m;

    /* JADX INFO: renamed from: n */
    public PutongAct f203265n;

    /* JADX INFO: renamed from: o */
    public ki20 f203266o;

    /* JADX INFO: renamed from: q */
    public j90 f203268q;

    /* JADX INFO: renamed from: r */
    public Dialog f203269r;

    /* JADX INFO: renamed from: i */
    public ArrayList<String> f203260i = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f203267p = new ViewOnClickListenerC21708a();

    /* JADX INFO: renamed from: s */
    public eml.InterfaceC16646a f203270s = new C21709b();

    /* JADX INFO: renamed from: t */
    public boolean f203271t = false;

    /* JADX INFO: renamed from: l.zi20$a */
    public class ViewOnClickListenerC21708a implements View.OnClickListener {
        public ViewOnClickListenerC21708a() {
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m218936e() {
            if (NullChecker.m81303a(zi20.this.f203269r)) {
                zi20.this.f203269r.dismiss();
            }
            zi20.this.f203262k = null;
            zi20.this.f203257f.setText((CharSequence) null);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m218937f(k90 k90Var) {
            if (NullChecker.m81303a(zi20.this.f203269r)) {
                zi20.this.f203269r.dismiss();
            }
            zi20.this.f203262k = new MessageLocation();
            zi20.this.f203262k.name = k90Var.m144984c();
            zi20.this.f203262k.address = k90Var.m144982a();
            zi20.this.f203262k.coordinates = k90Var.m144983b();
            zi20 zi20Var = zi20.this;
            zi20Var.f203257f.setText(zi20Var.f203262k.name);
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m218938g(DialogInterface dialogInterface) {
            zi20.this.f203269r = null;
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m218939h(Notification notification) {
            if (notification.m221300k()) {
                zi20.this.f203264m.mo114573a((Location) notification.m221295f(), zi20.this.f203265n);
                return;
            }
            if (notification.m221298i() && NullChecker.m81303a(zi20.this.f203269r)) {
                try {
                    zi20.this.f203269r.dismiss();
                } catch (Exception e) {
                    CrashHelper.m81296c(new Exception("NewCaptionAct exception:" + e.getMessage(), e));
                }
                zi20 zi20Var = zi20.this;
                PutongAct putongAct = zi20Var.f203265n;
                ki20 ki20Var = zi20Var.f203266o;
                v1h.m196558E0(putongAct, 1);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zi20 zi20Var = zi20.this;
            if (zi20Var.f203268q == null) {
                zi20Var.f203268q = new j90(zi20.this.f203265n);
                zi20.this.f203268q.m140482B(new Runnable() { // from class: l.vi20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f181550a.m218936e();
                    }
                });
                zi20.this.f203268q.m140483C(new e30() { // from class: l.wi20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f186498a.m218937f((k90) obj);
                    }
                });
                zi20.this.f203264m.init();
            }
            zi20 zi20Var2 = zi20.this;
            zi20Var2.f203269r = zi20Var2.f203265n.dialog().m20547p(zi20.this.f203268q).m20526V(new DialogInterface.OnDismissListener() { // from class: l.xi20
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f192957a.m218938g(dialogInterface);
                }
            }).m20568z0();
            zi20.this.f203266o.duringCreated(qib0.f154687E.m78864p().take(3L, TimeUnit.SECONDS).materialize().first().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.yi20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f198439a.m218939h((Notification) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l.zi20$b */
    public class C21709b implements eml.InterfaceC16646a {
        public C21709b() {
        }

        @Override // p149l.eml.InterfaceC16646a
        /* JADX INFO: renamed from: a */
        public void mo117206a(List<k90> list) {
            if (NullChecker.m81304b(zi20.this.f203268q)) {
                zi20.this.f203268q.m140481A(list, true);
            }
        }

        @Override // p149l.eml.InterfaceC16646a
        public void onError(Throwable th) {
            if (NullChecker.m81303a(zi20.this.f203269r)) {
                zi20.this.f203269r.dismiss();
            }
            lsi0.m151584n(R$string.f38981U);
        }
    }

    public zi20(PutongAct putongAct) {
        this.f203265n = putongAct;
    }

    /* JADX INFO: renamed from: r */
    private void m218917r() {
        this.f203253b.setMaxLength(200);
        if (!ll40.m150404b()) {
            this.f203256e.setVisibility(8);
            return;
        }
        Drawable drawable = this.f203265n.getResources().getDrawable(f3c0.f94527g6);
        drawable.setBounds(0, 0, t100.m186890d(16.0f), t100.m186890d(16.0f));
        this.f203256e.setCompoundDrawables(drawable, null, null, null);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f203265n;
    }

    @Override // p149l.fyl
    /* JADX INFO: renamed from: a */
    public void mo62885a() {
        this.f203266o.m146051o0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f203265n;
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f203264m)) {
            this.f203264m.destroy();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM218918j = m218918j(layoutInflater, viewGroup);
        m218917r();
        return viewM218918j;
    }

    /* JADX INFO: renamed from: j */
    public View m218918j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aj20.m96968b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m218919k() {
        new C0605k(new C21711d()).m3750g(this.f203255d);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ki20 ki20Var) {
        this.f203266o = ki20Var;
    }

    /* JADX INFO: renamed from: m */
    public MessageLocation m218921m() {
        return this.f203262k;
    }

    /* JADX INFO: renamed from: n */
    public String m218922n() {
        return this.f203253b.getText().toString();
    }

    /* JADX INFO: renamed from: p */
    public boolean m218923p() {
        return this.f203259h.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: q */
    public boolean m218924q() {
        return !m218922n().trim().isEmpty();
    }

    /* JADX INFO: renamed from: s */
    public void m218925s(PutongAct putongAct) {
        putongAct.hideInput(this.f203253b);
    }

    /* JADX INFO: renamed from: u */
    public void m218926u() {
        this.f203253b.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.ti20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170520a.m218927v((CharSequence) obj);
            }
        }));
        this.f203261j = new od80(this.f203265n, this, true, null);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f203265n, 3);
        this.f203263l = gridLayoutManager;
        this.f203255d.setLayoutManager(gridLayoutManager);
        this.f203255d.setAdapter(this.f203261j);
        this.f203263l.scrollToPosition(this.f203261j.getItemCount() - 1);
        this.f203261j.m163654H(this.f203266o.m146042f0());
        this.f203264m = new p90(this.f203270s);
        xdl0.m208329E0(this.f203257f, this.f203267p);
        this.f203253b.addTextChangedListener(new C21710c());
        m218919k();
        this.f203253b.post(new Runnable() { // from class: l.ui20
            @Override // java.lang.Runnable
            public final void run() {
                this.f176619a.m218928w();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m218927v(CharSequence charSequence) {
        this.f203266o.m146051o0();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m218928w() {
        this.f203253b.requestFocus();
    }

    /* JADX INFO: renamed from: x */
    public void m218929x(ArrayList<Media> arrayList) {
        od80 od80Var = this.f203261j;
        if (od80Var == null || arrayList == null) {
            return;
        }
        od80Var.m163654H(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public void m218930y(ArrayList<Media> arrayList) {
        od80 od80Var = this.f203261j;
        if (od80Var == null || arrayList == null) {
            return;
        }
        od80Var.m163654H(arrayList);
        this.f203263l.scrollToPosition(this.f203261j.getItemCount() - 1);
    }

    /* JADX INFO: renamed from: z */
    public void m218931z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f203253b.setText(str);
        this.f203253b.setSelection(str.length());
    }

    /* JADX INFO: renamed from: l.zi20$d */
    public class C21711d extends C0605k.e {
        public C21711d() {
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: k */
        public int mo3783k(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
            int itemViewType = abstractC0566d0.getItemViewType();
            od80 unused = zi20.this.f203261j;
            if (itemViewType != 0) {
                return 0;
            }
            return C0605k.e.m3771t(15, 0);
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: y */
        public boolean mo3795y(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0566d0 abstractC0566d1) {
            int adapterPosition = abstractC0566d0.getAdapterPosition();
            int adapterPosition2 = abstractC0566d1.getAdapterPosition();
            if (adapterPosition < adapterPosition2) {
                int i = adapterPosition;
                while (i < adapterPosition2) {
                    int i2 = i + 1;
                    if (i2 >= zi20.this.f203266o.m146042f0().size()) {
                        break;
                    }
                    Collections.swap(zi20.this.f203266o.m146042f0(), i, i2);
                    i = i2;
                }
            } else {
                for (int i3 = adapterPosition; i3 > adapterPosition2 && i3 > 0; i3--) {
                    Collections.swap(zi20.this.f203266o.m146042f0(), i3, i3 - 1);
                }
            }
            zi20.this.f203261j.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: B */
        public void mo3773B(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        }
    }

    /* JADX INFO: renamed from: l.zi20$c */
    public class C21710c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public int f203274a = 0;

        /* JADX INFO: renamed from: b */
        public int f203275b = 0;

        /* JADX INFO: renamed from: c */
        public int f203276c = 0;

        /* JADX INFO: renamed from: d */
        public int f203277d = 0;

        public C21710c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strCall = yij0.f198513j.call(editable);
            zi20 zi20Var = zi20.this;
            if (strCall == null) {
                xdl0.m208344M(zi20Var.f203259h, false);
                zi20.this.f203266o.m146051o0();
            } else {
                zi20Var.f203259h.setText(strCall);
                xdl0.m208345M0(zi20.this.f203259h, true);
                zi20.this.f203266o.m146051o0();
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

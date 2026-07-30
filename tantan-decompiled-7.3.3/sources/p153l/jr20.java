package p153l;

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
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.EditTextInScrollView;
import com.p051p1.mobile.putong.location.Location;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.Notification;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jr20 implements y0m, iam<uq20> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f122277a;

    /* JADX INFO: renamed from: b */
    public EditTextInScrollView f122278b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f122279c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f122280d;

    /* JADX INFO: renamed from: e */
    public VText f122281e;

    /* JADX INFO: renamed from: f */
    public VText f122282f;

    /* JADX INFO: renamed from: g */
    public View f122283g;

    /* JADX INFO: renamed from: h */
    public VText f122284h;

    /* JADX INFO: renamed from: j */
    public xl80 f122286j;

    /* JADX INFO: renamed from: k */
    public MessageLocation f122287k;

    /* JADX INFO: renamed from: l */
    public LinearLayoutManager f122288l;

    /* JADX INFO: renamed from: m */
    public l90 f122289m;

    /* JADX INFO: renamed from: n */
    public PutongAct f122290n;

    /* JADX INFO: renamed from: o */
    public uq20 f122291o;

    /* JADX INFO: renamed from: q */
    public f90 f122293q;

    /* JADX INFO: renamed from: r */
    public Dialog f122294r;

    /* JADX INFO: renamed from: i */
    public ArrayList<String> f122285i = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public View.OnClickListener f122292p = new ViewOnClickListenerC18012a();

    /* JADX INFO: renamed from: s */
    public qol.InterfaceC19615a f122295s = new C18013b();

    /* JADX INFO: renamed from: t */
    public boolean f122296t = false;

    /* JADX INFO: renamed from: l.jr20$a */
    public class ViewOnClickListenerC18012a implements View.OnClickListener {
        public ViewOnClickListenerC18012a() {
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m146703e() {
            if (NullChecker.m82486a(jr20.this.f122294r)) {
                jr20.this.f122294r.dismiss();
            }
            jr20.this.f122287k = null;
            jr20.this.f122282f.setText((CharSequence) null);
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m146704f(g90 g90Var) {
            if (NullChecker.m82486a(jr20.this.f122294r)) {
                jr20.this.f122294r.dismiss();
            }
            jr20.this.f122287k = new MessageLocation();
            jr20.this.f122287k.name = g90Var.m129468c();
            jr20.this.f122287k.address = g90Var.m129466a();
            jr20.this.f122287k.coordinates = g90Var.m129467b();
            jr20 jr20Var = jr20.this;
            jr20Var.f122282f.setText(jr20Var.f122287k.name);
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m146705g(DialogInterface dialogInterface) {
            jr20.this.f122294r = null;
        }

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ void m146706h(Notification notification) {
            if (notification.m222546k()) {
                jr20.this.f122289m.mo119236a((Location) notification.m222541f(), jr20.this.f122290n);
                return;
            }
            if (notification.m222544i() && NullChecker.m82486a(jr20.this.f122294r)) {
                try {
                    jr20.this.f122294r.dismiss();
                } catch (Exception e) {
                    CrashHelper.m82479c(new Exception("NewCaptionAct exception:" + e.getMessage(), e));
                }
                jr20 jr20Var = jr20.this;
                PutongAct putongAct = jr20Var.f122290n;
                uq20 uq20Var = jr20Var.f122291o;
                k3h.m148035E0(putongAct, 1);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            jr20 jr20Var = jr20.this;
            if (jr20Var.f122293q == null) {
                jr20Var.f122293q = new f90(jr20.this.f122290n);
                jr20.this.f122293q.m124581B(new Runnable() { // from class: l.fr20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f100392a.m146703e();
                    }
                });
                jr20.this.f122293q.m124582C(new y20() { // from class: l.gr20
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f105997a.m146704f((g90) obj);
                    }
                });
                jr20.this.f122289m.init();
            }
            jr20 jr20Var2 = jr20.this;
            jr20Var2.f122294r = jr20Var2.f122290n.dialog().m21546p(jr20.this.f122293q).m21525V(new DialogInterface.OnDismissListener() { // from class: l.hr20
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f111219a.m146705g(dialogInterface);
                }
            }).m21567z0();
            jr20.this.f122291o.duringCreated(uqb0.f180370E.m80047p().take(3L, TimeUnit.SECONDS).materialize().first().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.ir20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f116502a.m146706h((Notification) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l.jr20$b */
    public class C18013b implements qol.InterfaceC19615a {
        public C18013b() {
        }

        @Override // p153l.qol.InterfaceC19615a
        /* JADX INFO: renamed from: a */
        public void mo146707a(List<g90> list) {
            if (NullChecker.m82487b(jr20.this.f122293q)) {
                jr20.this.f122293q.m124580A(list, true);
            }
        }

        @Override // p153l.qol.InterfaceC19615a
        public void onError(Throwable th) {
            if (NullChecker.m82486a(jr20.this.f122294r)) {
                jr20.this.f122294r.dismiss();
            }
            o1j0.m165640n(R$string.f39829U);
        }
    }

    public jr20(PutongAct putongAct) {
        this.f122290n = putongAct;
    }

    /* JADX INFO: renamed from: r */
    private void m146684r() {
        this.f122278b.setMaxLength(200);
        if (!zt40.m221414b()) {
            this.f122281e.setVisibility(8);
            return;
        }
        Drawable drawable = this.f122290n.getResources().getDrawable(lbc0.f131045g6);
        drawable.setBounds(0, 0, qa00.m175859d(16.0f), qa00.m175859d(16.0f));
        this.f122281e.setCompoundDrawables(drawable, null, null, null);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f122290n;
    }

    @Override // p153l.y0m
    /* JADX INFO: renamed from: a */
    public void mo64068a() {
        this.f122291o.m197209o0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f122290n;
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f122289m)) {
            this.f122289m.destroy();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM146685j = m146685j(layoutInflater, viewGroup);
        m146684r();
        return viewM146685j;
    }

    /* JADX INFO: renamed from: j */
    public View m146685j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kr20.m150975b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m146686k() {
        new C0607k(new C18015d()).m3751g(this.f122280d);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(uq20 uq20Var) {
        this.f122291o = uq20Var;
    }

    /* JADX INFO: renamed from: m */
    public MessageLocation m146688m() {
        return this.f122287k;
    }

    /* JADX INFO: renamed from: n */
    public String m146689n() {
        return this.f122278b.getText().toString();
    }

    /* JADX INFO: renamed from: p */
    public boolean m146690p() {
        return this.f122284h.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: q */
    public boolean m146691q() {
        return !m146689n().trim().isEmpty();
    }

    /* JADX INFO: renamed from: s */
    public void m146692s(PutongAct putongAct) {
        putongAct.hideInput(this.f122278b);
    }

    /* JADX INFO: renamed from: u */
    public void m146693u() {
        this.f122278b.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.dr20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90353a.m146694v((CharSequence) obj);
            }
        }));
        this.f122286j = new xl80(this.f122290n, this, true, null);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f122290n, 3);
        this.f122288l = gridLayoutManager;
        this.f122280d.setLayoutManager(gridLayoutManager);
        this.f122280d.setAdapter(this.f122286j);
        this.f122288l.scrollToPosition(this.f122286j.getItemCount() - 1);
        this.f122286j.m211547H(this.f122291o.m197200f0());
        this.f122289m = new l90(this.f122295s);
        bnl0.m105509E0(this.f122282f, this.f122292p);
        this.f122278b.addTextChangedListener(new C18014c());
        m146686k();
        this.f122278b.post(new Runnable() { // from class: l.er20
            @Override // java.lang.Runnable
            public final void run() {
                this.f95435a.m146695w();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m146694v(CharSequence charSequence) {
        this.f122291o.m197209o0();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m146695w() {
        this.f122278b.requestFocus();
    }

    /* JADX INFO: renamed from: x */
    public void m146696x(ArrayList<Media> arrayList) {
        xl80 xl80Var = this.f122286j;
        if (xl80Var == null || arrayList == null) {
            return;
        }
        xl80Var.m211547H(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public void m146697y(ArrayList<Media> arrayList) {
        xl80 xl80Var = this.f122286j;
        if (xl80Var == null || arrayList == null) {
            return;
        }
        xl80Var.m211547H(arrayList);
        this.f122288l.scrollToPosition(this.f122286j.getItemCount() - 1);
    }

    /* JADX INFO: renamed from: z */
    public void m146698z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f122278b.setText(str);
        this.f122278b.setSelection(str.length());
    }

    /* JADX INFO: renamed from: l.jr20$d */
    public class C18015d extends C0607k.e {
        public C18015d() {
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: k */
        public int mo3784k(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
            int itemViewType = abstractC0569e0.getItemViewType();
            xl80 unused = jr20.this.f122286j;
            if (itemViewType != 0) {
                return 0;
            }
            return C0607k.e.m3772t(15, 0);
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: y */
        public boolean mo3796y(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1) {
            int adapterPosition = abstractC0569e0.getAdapterPosition();
            int adapterPosition2 = abstractC0569e1.getAdapterPosition();
            if (adapterPosition < adapterPosition2) {
                int i = adapterPosition;
                while (i < adapterPosition2) {
                    int i2 = i + 1;
                    if (i2 >= jr20.this.f122291o.m197200f0().size()) {
                        break;
                    }
                    Collections.swap(jr20.this.f122291o.m197200f0(), i, i2);
                    i = i2;
                }
            } else {
                for (int i3 = adapterPosition; i3 > adapterPosition2 && i3 > 0; i3--) {
                    Collections.swap(jr20.this.f122291o.m197200f0(), i3, i3 - 1);
                }
            }
            jr20.this.f122286j.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: B */
        public void mo3774B(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        }
    }

    /* JADX INFO: renamed from: l.jr20$c */
    public class C18014c implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public int f122299a = 0;

        /* JADX INFO: renamed from: b */
        public int f122300b = 0;

        /* JADX INFO: renamed from: c */
        public int f122301c = 0;

        /* JADX INFO: renamed from: d */
        public int f122302d = 0;

        public C18014c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strCall = bsj0.f78170j.call(editable);
            jr20 jr20Var = jr20.this;
            if (strCall == null) {
                bnl0.m105524M(jr20Var.f122284h, false);
                jr20.this.f122291o.m197209o0();
            } else {
                jr20Var.f122284h.setText(strCall);
                bnl0.m105525M0(jr20.this.f122284h, true);
                jr20.this.f122291o.m197209o0();
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

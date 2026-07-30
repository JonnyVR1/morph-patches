package p153l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class kqk extends Dialog implements wdk {

    /* JADX INFO: renamed from: w */
    public static boolean f128230w = false;

    /* JADX INFO: renamed from: a */
    public FrameLayout f128231a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f128232b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f128233c;

    /* JADX INFO: renamed from: d */
    public EditText f128234d;

    /* JADX INFO: renamed from: e */
    public TextView f128235e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f128236f;

    /* JADX INFO: renamed from: g */
    public VImage f128237g;

    /* JADX INFO: renamed from: h */
    public VText f128238h;

    /* JADX INFO: renamed from: i */
    public VImage f128239i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f128240j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f128241k;

    /* JADX INFO: renamed from: l */
    public VImage f128242l;

    /* JADX INFO: renamed from: m */
    public VText f128243m;

    /* JADX INFO: renamed from: n */
    public boolean f128244n;

    /* JADX INFO: renamed from: o */
    public String f128245o;

    /* JADX INFO: renamed from: p */
    public boolean f128246p;

    /* JADX INFO: renamed from: q */
    public l4g0 f128247q;

    /* JADX INFO: renamed from: r */
    public C22507a<String> f128248r;

    /* JADX INFO: renamed from: s */
    public C22507a<uxj0> f128249s;

    /* JADX INFO: renamed from: t */
    public InterfaceC18243d f128250t;

    /* JADX INFO: renamed from: u */
    public Act f128251u;

    /* JADX INFO: renamed from: v */
    public cek f128252v;

    /* JADX INFO: renamed from: l.kqk$b */
    public class C18241b extends RecyclerView.AbstractC0584t {
        public C18241b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                kqk.this.m150915s();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.kqk$c */
    public class DialogInterfaceOnDismissListenerC18242c implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC18242c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            kqk.f128230w = false;
            w1e.m204401e(kqk.this.f128247q);
            if (kqk.this.f128244n || !NullChecker.m82486a(kqk.this.f128250t)) {
                return;
            }
            kqk.this.f128250t.onCancel();
        }
    }

    /* JADX INFO: renamed from: l.kqk$d */
    public interface InterfaceC18243d {
        /* JADX INFO: renamed from: a */
        void mo103709a(dek dekVar);

        void onCancel();
    }

    public kqk(Act act, int i) {
        super(act, i);
        this.f128244n = false;
        this.f128246p = false;
        this.f128248r = C22507a.m222758b();
        this.f128249s = C22507a.m222758b();
        this.f128251u = act;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m150894c(dek dekVar, dek dekVar2) {
        if ((!dekVar.f88042g.startsWith("#") || dekVar2.f88042g.startsWith("#")) && (dekVar.f88042g.startsWith("#") || !dekVar2.f88042g.startsWith("#"))) {
            return dekVar.f88042g.compareTo(dekVar2.f88042g);
        }
        return dekVar.f88042g.startsWith("#") ? 1 : -1;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m150899h(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m150901j(View view) {
    }

    /* JADX INFO: renamed from: r */
    public static boolean m150908r() {
        return f128230w;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m150909A(View view) {
        this.f128234d.setText("");
        bnl0.m105524M(this.f128236f, true);
        bnl0.m105524M(this.f128233c, false);
        this.f128234d.clearFocus();
        m150915s();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m150910B(View view) {
        m150915s();
        dismiss();
    }

    /* JADX INFO: renamed from: C */
    public void m150911C(InterfaceC18243d interfaceC18243d, String str) {
        this.f128250t = interfaceC18243d;
        this.f128245o = str;
        this.f128246p = jek.m144587s(CoreModule.f18264c.f20387g0.m32923s6(str));
        CoreModule.f18264c.f20387g0.m32840Q8(str);
        show();
        this.f128244n = false;
        f128230w = true;
    }

    /* JADX INFO: renamed from: D */
    public final void m150912D(String str) {
        String upperCase = str.toUpperCase();
        if (TextUtils.equals(this.f128248r.m222761e(), upperCase)) {
            return;
        }
        this.f128248r.onNext(upperCase);
    }

    @Override // p153l.wdk
    /* JADX INFO: renamed from: a */
    public void mo150913a(dek dekVar) {
        this.f128244n = true;
        dismiss();
        if (NullChecker.m82486a(this.f128250t)) {
            this.f128250t.mo103709a(dekVar);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f128230w = false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m150914q(getLayoutInflater(), null));
        this.f128252v = new cek(this.f128251u, this);
        this.f128240j.setLayoutManager(new LinearLayoutManager(this.f128251u, 1, false));
        this.f128240j.setAdapter(this.f128252v);
        this.f128238h.getPaint().setFakeBoldText(true);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(cgc0.f81650f);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        m150917u();
        this.f128234d.addTextChangedListener(new C18240a());
        bnl0.m105509E0(this.f128237g, new View.OnClickListener() { // from class: l.zpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205476a.m150921y(view);
            }
        });
        bnl0.m105509E0(this.f128239i, new View.OnClickListener() { // from class: l.bqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77904a.m150922z(view);
            }
        });
        bnl0.m105509E0(this.f128235e, new View.OnClickListener() { // from class: l.cqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83100a.m150909A(view);
            }
        });
        bnl0.m105509E0(this.f128231a, new View.OnClickListener() { // from class: l.dqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90257a.m150910B(view);
            }
        });
        bnl0.m105509E0(this.f128232b, new View.OnClickListener() { // from class: l.eqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kqk.m150901j(view);
            }
        });
        this.f128240j.addOnScrollListener(new C18241b());
        setOnDismissListener(new DialogInterfaceOnDismissListenerC18242c());
        l4g0 l4g0VarM204399c = w1e.m204399c("p_at_popup", com.p051p1.mobile.android.app.Dialog.class.getName());
        this.f128247q = l4g0VarM204399c;
        w1e.m204402f(l4g0VarM204399c);
        ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(this.f128245o);
        if (NullChecker.m82486a(chatGroupM32923s6)) {
            this.f128238h.setText(chatGroupM32923s6.name);
        }
    }

    /* JADX INFO: renamed from: q */
    public View m150914q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lqk.m155496b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public final void m150915s() {
        try {
            getWindow().setSoftInputMode(3);
            if (getWindow().getCurrentFocus() != null) {
                m150916t().hideSoftInputFromWindow(getWindow().getCurrentFocus().getWindowToken(), 0);
            } else {
                m150916t().hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final InputMethodManager m150916t() {
        return (InputMethodManager) getContext().getSystemService("input_method");
    }

    /* JADX INFO: renamed from: u */
    public final void m150917u() {
        this.f128251u.duringCreated(C22421c.combineLatest(this.f128248r, this.f128249s, new rcj() { // from class: l.fqk
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new Pair((String) obj, (uxj0) obj2);
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.gqk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f105687a.m150918v((Pair) obj);
            }
        }).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.hqk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111138a.m150919w((List) obj);
            }
        }, new y20() { // from class: l.iqk
            @Override // p153l.y20
            public final void call(Object obj) {
                kqk.m150899h((Throwable) obj);
            }
        }));
        this.f128251u.duringCreated(CoreModule.f18264c.f20387g0.m32846S8()).subscribe(psd0.m173596G(new y20() { // from class: l.jqk
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122225a.m150920x((uxj0) obj);
            }
        }));
        this.f128248r.onNext("");
        this.f128249s.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ List m150918v(Pair pair) {
        String str = (String) pair.first;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        List<ChatGroupMember> listM32879d9 = !zIsEmpty ? CoreModule.f18264c.f20387g0.m32879d9(str, this.f128245o) : CoreModule.f18264c.f20387g0.m32855V8(this.f128245o);
        ArrayList arrayList = new ArrayList();
        int size = listM32879d9.size();
        for (ChatGroupMember chatGroupMember : listM32879d9) {
            if (!TextUtils.equals(chatGroupMember.userId, CoreModule.m30929H().userId())) {
                dek dekVar = new dek();
                dekVar.f88038c = chatGroupMember.avatar;
                dekVar.f88040e = 0;
                dekVar.f88042g = chatGroupMember.nickNamePinyin;
                dekVar.f88037b = chatGroupMember.groupMemberName();
                dekVar.f88036a = chatGroupMember.userId;
                dekVar.f88039d = this.f128246p;
                dekVar.f88043h = chatGroupMember;
                if (!Character.isLetter(!TextUtils.isEmpty(dekVar.f88042g) ? dekVar.f88042g.charAt(0) : '#') && zIsEmpty) {
                    dekVar.f88042g = "#" + dekVar.f88042g;
                }
                arrayList.add(dekVar);
            }
        }
        jyb.m147478I(arrayList, new Comparator() { // from class: l.aqk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return kqk.m150894c((dek) obj, (dek) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        dek dekVar2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            dek dekVar3 = (dek) arrayList.get(i);
            if (zIsEmpty && (dekVar2 == null || !TextUtils.equals(dekVar2.f88042g.substring(0, 1), dekVar3.f88042g.substring(0, 1)))) {
                dek dekVar4 = new dek();
                dekVar4.f88040e = 1;
                dekVar4.f88041f = dekVar3.f88042g.substring(0, 1);
                arrayList2.add(dekVar4);
            }
            arrayList2.add(dekVar3);
            i++;
            dekVar2 = dekVar3;
        }
        if (zIsEmpty) {
            dek dekVar5 = new dek();
            dekVar5.f88040e = 2;
            dekVar5.f88036a = "0";
            int i2 = size - 1;
            if (i2 == 0) {
                dekVar5.f88041f = CoreModule.f18263b.getString(R$string.f21525J2);
            } else {
                dekVar5.f88041f = CoreModule.f18263b.getString(R$string.f21525J2) + "（" + i2 + "）";
            }
            dekVar5.f88037b = CoreModule.f18263b.getString(R$string.f21525J2);
            arrayList2.add(0, dekVar5);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m150919w(List list) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f128248r.m222761e());
        LinearLayout linearLayout = this.f128241k;
        if (zIsEmpty) {
            bnl0.m105524M(linearLayout, false);
        } else {
            bnl0.m105524M(linearLayout, jyb.m147479J(list));
        }
        this.f128252v.m109377G(list);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m150920x(uxj0 uxj0Var) {
        this.f128249s.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m150921y(View view) {
        m150915s();
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m150922z(View view) {
        bnl0.m105524M(this.f128236f, false);
        bnl0.m105524M(this.f128233c, true);
        this.f128234d.requestFocus();
        this.f128251u.showInput(this.f128234d, 0);
    }

    /* JADX INFO: renamed from: l.kqk$a */
    public class C18240a implements TextWatcher {
        public C18240a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            kqk.this.m150912D(editable.toString().trim());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

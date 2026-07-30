package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class unk extends Dialog implements gbk {

    /* JADX INFO: renamed from: w */
    public static boolean f177367w = false;

    /* JADX INFO: renamed from: a */
    public FrameLayout f177368a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f177369b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f177370c;

    /* JADX INFO: renamed from: d */
    public EditText f177371d;

    /* JADX INFO: renamed from: e */
    public TextView f177372e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f177373f;

    /* JADX INFO: renamed from: g */
    public VImage f177374g;

    /* JADX INFO: renamed from: h */
    public VText f177375h;

    /* JADX INFO: renamed from: i */
    public VImage f177376i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f177377j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f177378k;

    /* JADX INFO: renamed from: l */
    public VImage f177379l;

    /* JADX INFO: renamed from: m */
    public VText f177380m;

    /* JADX INFO: renamed from: n */
    public boolean f177381n;

    /* JADX INFO: renamed from: o */
    public String f177382o;

    /* JADX INFO: renamed from: p */
    public boolean f177383p;

    /* JADX INFO: renamed from: q */
    public cwf0 f177384q;

    /* JADX INFO: renamed from: r */
    public C22392a<String> f177385r;

    /* JADX INFO: renamed from: s */
    public C22392a<roj0> f177386s;

    /* JADX INFO: renamed from: t */
    public InterfaceC20465d f177387t;

    /* JADX INFO: renamed from: u */
    public Act f177388u;

    /* JADX INFO: renamed from: v */
    public mbk f177389v;

    /* JADX INFO: renamed from: l.unk$b */
    public class C20463b extends RecyclerView.AbstractC0582t {
        public C20463b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                unk.this.m194446s();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.unk$c */
    public class DialogInterfaceOnDismissListenerC20464c implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC20464c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            unk.f177367w = false;
            i0e.m133796e(unk.this.f177384q);
            if (unk.this.f177381n || !NullChecker.m81303a(unk.this.f177387t)) {
                return;
            }
            unk.this.f177387t.onCancel();
        }
    }

    /* JADX INFO: renamed from: l.unk$d */
    public interface InterfaceC20465d {
        /* JADX INFO: renamed from: a */
        void mo149234a(nbk nbkVar);

        void onCancel();
    }

    public unk(Act act, int i) {
        super(act, i);
        this.f177381n = false;
        this.f177383p = false;
        this.f177385r = C22392a.m221512b();
        this.f177386s = C22392a.m221512b();
        this.f177388u = act;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m194426c(nbk nbkVar, nbk nbkVar2) {
        if ((!nbkVar.f138044g.startsWith("#") || nbkVar2.f138044g.startsWith("#")) && (nbkVar.f138044g.startsWith("#") || !nbkVar2.f138044g.startsWith("#"))) {
            return nbkVar.f138044g.compareTo(nbkVar2.f138044g);
        }
        return nbkVar.f138044g.startsWith("#") ? 1 : -1;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m194431h(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m194433j(View view) {
    }

    /* JADX INFO: renamed from: r */
    public static boolean m194440r() {
        return f177367w;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m194441A(View view) {
        this.f177371d.setText("");
        xdl0.m208344M(this.f177373f, true);
        xdl0.m208344M(this.f177370c, false);
        this.f177371d.clearFocus();
        m194446s();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m194442B(View view) {
        m194446s();
        dismiss();
    }

    /* JADX INFO: renamed from: C */
    public void m194443C(InterfaceC20465d interfaceC20465d, String str) {
        this.f177387t = interfaceC20465d;
        this.f177382o = str;
        this.f177383p = tbk.m187872s(CoreModule.f17545c.f19645g0.m31920s6(str));
        CoreModule.f17545c.f19645g0.m31837Q8(str);
        show();
        this.f177381n = false;
        f177367w = true;
    }

    /* JADX INFO: renamed from: D */
    public final void m194444D(String str) {
        String upperCase = str.toUpperCase();
        if (TextUtils.equals(this.f177385r.m221515e(), upperCase)) {
            return;
        }
        this.f177385r.onNext(upperCase);
    }

    @Override // p149l.gbk
    /* JADX INFO: renamed from: a */
    public void mo125146a(nbk nbkVar) {
        this.f177381n = true;
        dismiss();
        if (NullChecker.m81303a(this.f177387t)) {
            this.f177387t.mo149234a(nbkVar);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f177367w = false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m194445q(getLayoutInflater(), null));
        this.f177389v = new mbk(this.f177388u, this);
        this.f177377j.setLayoutManager(new LinearLayoutManager(this.f177388u, 1, false));
        this.f177377j.setAdapter(this.f177389v);
        this.f177375h.getPaint().setFakeBoldText(true);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(x7c0.f191337f);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        m194448u();
        this.f177371d.addTextChangedListener(new C20462a());
        xdl0.m208329E0(this.f177374g, new View.OnClickListener() { // from class: l.jnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118869a.m194452y(view);
            }
        });
        xdl0.m208329E0(this.f177376i, new View.OnClickListener() { // from class: l.lnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128996a.m194453z(view);
            }
        });
        xdl0.m208329E0(this.f177372e, new View.OnClickListener() { // from class: l.mnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134760a.m194441A(view);
            }
        });
        xdl0.m208329E0(this.f177368a, new View.OnClickListener() { // from class: l.nnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139732a.m194442B(view);
            }
        });
        xdl0.m208329E0(this.f177369b, new View.OnClickListener() { // from class: l.onk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                unk.m194433j(view);
            }
        });
        this.f177377j.addOnScrollListener(new C20463b());
        setOnDismissListener(new DialogInterfaceOnDismissListenerC20464c());
        cwf0 cwf0VarM133794c = i0e.m133794c("p_at_popup", com.p046p1.mobile.android.app.Dialog.class.getName());
        this.f177384q = cwf0VarM133794c;
        i0e.m133797f(cwf0VarM133794c);
        ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(this.f177382o);
        if (NullChecker.m81303a(chatGroupM31920s6)) {
            this.f177375h.setText(chatGroupM31920s6.name);
        }
    }

    /* JADX INFO: renamed from: q */
    public View m194445q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vnk.m199031b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public final void m194446s() {
        try {
            getWindow().setSoftInputMode(3);
            if (getWindow().getCurrentFocus() != null) {
                m194447t().hideSoftInputFromWindow(getWindow().getCurrentFocus().getWindowToken(), 0);
            } else {
                m194447t().hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final InputMethodManager m194447t() {
        return (InputMethodManager) getContext().getSystemService("input_method");
    }

    /* JADX INFO: renamed from: u */
    public final void m194448u() {
        this.f177388u.duringCreated(C22306c.combineLatest(this.f177385r, this.f177386s, new x9j() { // from class: l.pnk
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((String) obj, (roj0) obj2);
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.qnk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f155479a.m194449v((Pair) obj);
            }
        }).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.rnk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160272a.m194450w((List) obj);
            }
        }, new e30() { // from class: l.snk
            @Override // p149l.e30
            public final void call(Object obj) {
                unk.m194431h((Throwable) obj);
            }
        }));
        this.f177388u.duringCreated(CoreModule.f17545c.f19645g0.m31843S8()).subscribe(mkd0.m154955G(new e30() { // from class: l.tnk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171250a.m194451x((roj0) obj);
            }
        }));
        this.f177385r.onNext("");
        this.f177386s.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ List m194449v(Pair pair) {
        String str = (String) pair.first;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        List<ChatGroupMember> listM31876d9 = !zIsEmpty ? CoreModule.f17545c.f19645g0.m31876d9(str, this.f177382o) : CoreModule.f17545c.f19645g0.m31852V8(this.f177382o);
        ArrayList arrayList = new ArrayList();
        int size = listM31876d9.size();
        for (ChatGroupMember chatGroupMember : listM31876d9) {
            if (!TextUtils.equals(chatGroupMember.userId, CoreModule.m29931H().userId())) {
                nbk nbkVar = new nbk();
                nbkVar.f138040c = chatGroupMember.avatar;
                nbkVar.f138042e = 0;
                nbkVar.f138044g = chatGroupMember.nickNamePinyin;
                nbkVar.f138039b = chatGroupMember.groupMemberName();
                nbkVar.f138038a = chatGroupMember.userId;
                nbkVar.f138041d = this.f177383p;
                nbkVar.f138045h = chatGroupMember;
                if (!Character.isLetter(!TextUtils.isEmpty(nbkVar.f138044g) ? nbkVar.f138044g.charAt(0) : '#') && zIsEmpty) {
                    nbkVar.f138044g = "#" + nbkVar.f138044g;
                }
                arrayList.add(nbkVar);
            }
        }
        vwb.m200295I(arrayList, new Comparator() { // from class: l.knk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return unk.m194426c((nbk) obj, (nbk) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        nbk nbkVar2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            nbk nbkVar3 = (nbk) arrayList.get(i);
            if (zIsEmpty && (nbkVar2 == null || !TextUtils.equals(nbkVar2.f138044g.substring(0, 1), nbkVar3.f138044g.substring(0, 1)))) {
                nbk nbkVar4 = new nbk();
                nbkVar4.f138042e = 1;
                nbkVar4.f138043f = nbkVar3.f138044g.substring(0, 1);
                arrayList2.add(nbkVar4);
            }
            arrayList2.add(nbkVar3);
            i++;
            nbkVar2 = nbkVar3;
        }
        if (zIsEmpty) {
            nbk nbkVar5 = new nbk();
            nbkVar5.f138042e = 2;
            nbkVar5.f138038a = "0";
            int i2 = size - 1;
            if (i2 == 0) {
                nbkVar5.f138043f = CoreModule.f17544b.getString(R$string.f20783J2);
            } else {
                nbkVar5.f138043f = CoreModule.f17544b.getString(R$string.f20783J2) + "（" + i2 + "）";
            }
            nbkVar5.f138039b = CoreModule.f17544b.getString(R$string.f20783J2);
            arrayList2.add(0, nbkVar5);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m194450w(List list) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f177385r.m221515e());
        LinearLayout linearLayout = this.f177378k;
        if (zIsEmpty) {
            xdl0.m208344M(linearLayout, false);
        } else {
            xdl0.m208344M(linearLayout, vwb.m200296J(list));
        }
        this.f177389v.m153894G(list);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m194451x(roj0 roj0Var) {
        this.f177386s.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m194452y(View view) {
        m194446s();
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m194453z(View view) {
        xdl0.m208344M(this.f177373f, false);
        xdl0.m208344M(this.f177370c, true);
        this.f177371d.requestFocus();
        this.f177388u.showInput(this.f177371d, 0);
    }

    /* JADX INFO: renamed from: l.unk$a */
    public class C20462a implements TextWatcher {
        public C20462a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            unk.this.m194444D(editable.toString().trim());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

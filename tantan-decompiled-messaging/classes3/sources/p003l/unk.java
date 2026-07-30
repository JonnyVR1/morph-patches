package p003l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l.cwf0;
import l.i0e;
import l.mkd0;
import l.roj0;
import l.vnk;
import l.vwb;
import l.x7c0;
import l.xdl0;
import p014rx.C1099c;
import p014rx.schedulers.Schedulers;
import p014rx.subjects.C1185a;
import p028v.VImage;
import p028v.VRecyclerView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class unk extends Dialog implements gbk {

    /* JADX INFO: renamed from: w */
    public static boolean f8010w = false;

    /* JADX INFO: renamed from: a */
    public FrameLayout f8011a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f8012b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f8013c;

    /* JADX INFO: renamed from: d */
    public EditText f8014d;

    /* JADX INFO: renamed from: e */
    public TextView f8015e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f8016f;

    /* JADX INFO: renamed from: g */
    public VImage f8017g;

    /* JADX INFO: renamed from: h */
    public VText f8018h;

    /* JADX INFO: renamed from: i */
    public VImage f8019i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f8020j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f8021k;

    /* JADX INFO: renamed from: l */
    public VImage f8022l;

    /* JADX INFO: renamed from: m */
    public VText f8023m;

    /* JADX INFO: renamed from: n */
    public boolean f8024n;

    /* JADX INFO: renamed from: o */
    public String f8025o;

    /* JADX INFO: renamed from: p */
    public boolean f8026p;

    /* JADX INFO: renamed from: q */
    public cwf0 f8027q;

    /* JADX INFO: renamed from: r */
    public C1185a<String> f8028r;

    /* JADX INFO: renamed from: s */
    public C1185a<roj0> f8029s;

    /* JADX INFO: renamed from: t */
    public InterfaceC0580d f8030t;

    /* JADX INFO: renamed from: u */
    public Act f8031u;

    /* JADX INFO: renamed from: v */
    public mbk f8032v;

    /* JADX INFO: renamed from: l.unk$b */
    public class C0578b extends RecyclerView.t {
        public C0578b() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                unk.this.m8176s();
            }
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.unk$c */
    public class DialogInterfaceOnDismissListenerC0579c implements DialogInterface.OnDismissListener {
        public DialogInterfaceOnDismissListenerC0579c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            unk.f8010w = false;
            i0e.e(unk.this.f8027q);
            if (unk.this.f8024n || !NullChecker.a(unk.this.f8030t)) {
                return;
            }
            unk.this.f8030t.onCancel();
        }
    }

    /* JADX INFO: renamed from: l.unk$d */
    public interface InterfaceC0580d {
        /* JADX INFO: renamed from: a */
        void mo5998a(nbk nbkVar);

        void onCancel();
    }

    public unk(Act act, int i) {
        super(act, i);
        this.f8024n = false;
        this.f8026p = false;
        this.f8028r = C1185a.m9969b();
        this.f8029s = C1185a.m9969b();
        this.f8031u = act;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m8156c(nbk nbkVar, nbk nbkVar2) {
        if ((!nbkVar.f5864g.startsWith("#") || nbkVar2.f5864g.startsWith("#")) && (nbkVar.f5864g.startsWith("#") || !nbkVar2.f5864g.startsWith("#"))) {
            return nbkVar.f5864g.compareTo(nbkVar2.f5864g);
        }
        return nbkVar.f5864g.startsWith("#") ? 1 : -1;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m8161h(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m8163j(View view) {
    }

    /* JADX INFO: renamed from: r */
    public static boolean m8170r() {
        return f8010w;
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m8171A(View view) {
        this.f8014d.setText("");
        xdl0.M(this.f8016f, true);
        xdl0.M(this.f8013c, false);
        this.f8014d.clearFocus();
        m8176s();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m8172B(View view) {
        m8176s();
        dismiss();
    }

    /* JADX INFO: renamed from: C */
    public void m8173C(InterfaceC0580d interfaceC0580d, String str) {
        this.f8030t = interfaceC0580d;
        this.f8025o = str;
        this.f8026p = tbk.m7725s(CoreModule.c.g0.s6(str));
        CoreModule.c.g0.Q8(str);
        show();
        this.f8024n = false;
        f8010w = true;
    }

    /* JADX INFO: renamed from: D */
    public final void m8174D(String str) {
        String upperCase = str.toUpperCase();
        if (TextUtils.equals(this.f8028r.m9972e(), upperCase)) {
            return;
        }
        this.f8028r.onNext(upperCase);
    }

    @Override // p003l.gbk
    /* JADX INFO: renamed from: a */
    public void mo4526a(nbk nbkVar) {
        this.f8024n = true;
        dismiss();
        if (NullChecker.a(this.f8030t)) {
            this.f8030t.mo5998a(nbkVar);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f8010w = false;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m8175q(getLayoutInflater(), null));
        this.f8032v = new mbk(this.f8031u, this);
        this.f8020j.setLayoutManager(new LinearLayoutManager(this.f8031u, 1, false));
        this.f8020j.setAdapter(this.f8032v);
        this.f8018h.getPaint().setFakeBoldText(true);
        Window window = getWindow();
        window.setGravity(80);
        window.setWindowAnimations(x7c0.f);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        m8178u();
        this.f8014d.addTextChangedListener(new C0577a());
        xdl0.E0(this.f8017g, new View.OnClickListener() { // from class: l.jnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4690a.m8182y(view);
            }
        });
        xdl0.E0(this.f8019i, new View.OnClickListener() { // from class: l.lnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5371a.m8183z(view);
            }
        });
        xdl0.E0(this.f8015e, new View.OnClickListener() { // from class: l.mnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5694a.m8171A(view);
            }
        });
        xdl0.E0(this.f8011a, new View.OnClickListener() { // from class: l.nnk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5930a.m8172B(view);
            }
        });
        xdl0.E0(this.f8012b, new View.OnClickListener() { // from class: l.onk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                unk.m8163j(view);
            }
        });
        this.f8020j.addOnScrollListener(new C0578b());
        setOnDismissListener(new DialogInterfaceOnDismissListenerC0579c());
        cwf0 cwf0VarC = i0e.c("p_at_popup", com.p1.mobile.android.app.Dialog.class.getName());
        this.f8027q = cwf0VarC;
        i0e.f(cwf0VarC);
        ChatGroup chatGroupS6 = CoreModule.c.g0.s6(this.f8025o);
        if (NullChecker.a(chatGroupS6)) {
            this.f8018h.setText(chatGroupS6.name);
        }
    }

    /* JADX INFO: renamed from: q */
    public View m8175q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vnk.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: s */
    public final void m8176s() {
        try {
            getWindow().setSoftInputMode(3);
            if (getWindow().getCurrentFocus() != null) {
                m8177t().hideSoftInputFromWindow(getWindow().getCurrentFocus().getWindowToken(), 0);
            } else {
                m8177t().hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public final InputMethodManager m8177t() {
        return (InputMethodManager) getContext().getSystemService("input_method");
    }

    /* JADX INFO: renamed from: u */
    public final void m8178u() {
        this.f8031u.duringCreated(C1099c.combineLatest(this.f8028r, this.f8029s, new x9j() { // from class: l.pnk
            @Override // p003l.x9j
            public final Object call(Object obj, Object obj2) {
                return new Pair((String) obj, (roj0) obj2);
            }
        }).observeOn(Schedulers.m9950io()).map(new w9j() { // from class: l.qnk
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f6653a.m8179v((Pair) obj);
            }
        }).observeOn(jo0.m5414a())).subscribe((m250) mkd0.H(new e30() { // from class: l.rnk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7002a.m8180w((List) obj);
            }
        }, new e30() { // from class: l.snk
            @Override // p003l.e30
            public final void call(Object obj) {
                unk.m8161h((Throwable) obj);
            }
        }));
        this.f8031u.duringCreated(CoreModule.c.g0.S8()).subscribe((m250) mkd0.G(new e30() { // from class: l.tnk
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7563a.m8181x((roj0) obj);
            }
        }));
        this.f8028r.onNext("");
        this.f8029s.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ List m8179v(Pair pair) {
        String str = (String) pair.first;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        List<ChatGroupMember> listD9 = !zIsEmpty ? CoreModule.c.g0.d9(str, this.f8025o) : CoreModule.c.g0.V8(this.f8025o);
        ArrayList arrayList = new ArrayList();
        int size = listD9.size();
        for (ChatGroupMember chatGroupMember : listD9) {
            if (!TextUtils.equals(chatGroupMember.userId, CoreModule.H().userId())) {
                nbk nbkVar = new nbk();
                nbkVar.f5860c = chatGroupMember.avatar;
                nbkVar.f5862e = 0;
                nbkVar.f5864g = chatGroupMember.nickNamePinyin;
                nbkVar.f5859b = chatGroupMember.groupMemberName();
                nbkVar.f5858a = chatGroupMember.userId;
                nbkVar.f5861d = this.f8026p;
                nbkVar.f5865h = chatGroupMember;
                if (!Character.isLetter(!TextUtils.isEmpty(nbkVar.f5864g) ? nbkVar.f5864g.charAt(0) : '#') && zIsEmpty) {
                    nbkVar.f5864g = "#" + nbkVar.f5864g;
                }
                arrayList.add(nbkVar);
            }
        }
        vwb.I(arrayList, new Comparator() { // from class: l.knk
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return unk.m8156c((nbk) obj, (nbk) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        nbk nbkVar2 = null;
        int i = 0;
        while (i < arrayList.size()) {
            nbk nbkVar3 = (nbk) arrayList.get(i);
            if (zIsEmpty && (nbkVar2 == null || !TextUtils.equals(nbkVar2.f5864g.substring(0, 1), nbkVar3.f5864g.substring(0, 1)))) {
                nbk nbkVar4 = new nbk();
                nbkVar4.f5862e = 1;
                nbkVar4.f5863f = nbkVar3.f5864g.substring(0, 1);
                arrayList2.add(nbkVar4);
            }
            arrayList2.add(nbkVar3);
            i++;
            nbkVar2 = nbkVar3;
        }
        if (zIsEmpty) {
            nbk nbkVar5 = new nbk();
            nbkVar5.f5862e = 2;
            nbkVar5.f5858a = "0";
            int i2 = size - 1;
            if (i2 == 0) {
                nbkVar5.f5863f = CoreModule.b.getString(R.string.J2);
            } else {
                nbkVar5.f5863f = CoreModule.b.getString(R.string.J2) + "（" + i2 + "）";
            }
            nbkVar5.f5859b = CoreModule.b.getString(R.string.J2);
            arrayList2.add(0, nbkVar5);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m8180w(List list) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f8028r.m9972e());
        LinearLayout linearLayout = this.f8021k;
        if (zIsEmpty) {
            xdl0.M(linearLayout, false);
        } else {
            xdl0.M(linearLayout, vwb.J(list));
        }
        this.f8032v.m6329G(list);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m8181x(roj0 roj0Var) {
        this.f8029s.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m8182y(View view) {
        m8176s();
        dismiss();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8183z(View view) {
        xdl0.M(this.f8016f, false);
        xdl0.M(this.f8013c, true);
        this.f8014d.requestFocus();
        this.f8031u.showInput(this.f8014d, 0);
    }

    /* JADX INFO: renamed from: l.unk$a */
    public class C0577a implements TextWatcher {
        public C0577a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            unk.this.m8174D(editable.toString().trim());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}

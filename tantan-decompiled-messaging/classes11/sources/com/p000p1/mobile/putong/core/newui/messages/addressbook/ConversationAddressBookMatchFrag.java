package com.p000p1.mobile.putong.core.newui.messages.addressbook;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.mkd0;
import l.t100;
import l.v9j;
import p009l.b46;
import p009l.gj0;
import p009l.j36;
import p009l.q860;
import v.VPullUpRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationAddressBookMatchFrag extends PutongFrag implements v9j<String> {

    /* JADX INFO: renamed from: A */
    public VPullUpRecyclerView f4091A;

    /* JADX INFO: renamed from: z */
    public b46 f4092z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag$a */
    public class C0306a extends j36 {
        public C0306a(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // p009l.j36
        /* JADX INFO: renamed from: d */
        public void mo6005d(RecyclerView.d0 d0Var) {
            if (NullChecker.a(d0Var)) {
                KeyEvent.Callback callback = d0Var.itemView;
                if (callback instanceof gj0) {
                    ((gj0) callback).mo4633b();
                }
            }
        }

        @Override // p009l.j36
        /* JADX INFO: renamed from: f */
        public void mo6006f(RecyclerView.d0 d0Var) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag$b */
    public class C0307b extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f4094a;

        public C0307b(GridLayoutManager gridLayoutManager) {
            this.f4094a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m6007f(int i) {
            if (ConversationAddressBookMatchFrag.this.f4092z.m14438H(i) || ConversationAddressBookMatchFrag.this.f4092z.m14439I(i)) {
                return this.f4094a.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m5999N4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Q4 */
    public /* synthetic */ void m6001Q4(q860 q860Var) {
        this.f4092z.m14442L(q860Var.f19068a);
    }

    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "配对";
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: f4 */
    public void m6003f4() {
        super.f4();
        CoreModule.c.f0.Fo();
        CoreModule.c.N0.p3(true);
        duringCreated(CoreModule.c.f0.fo()).subscribe(mkd0.H(new e30() { // from class: l.c46
            public final void call(Object obj) {
                this.f10431a.m6001Q4((q860) obj);
            }
        }, new e30() { // from class: l.d46
            public final void call(Object obj) {
                ConversationAddressBookMatchFrag.m5999N4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m6004g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 2);
        gridLayoutManager.v(new C0307b(gridLayoutManager));
        this.f4091A.setLayoutManager(gridLayoutManager);
        b46 b46Var = new b46(this);
        this.f4092z = b46Var;
        this.f4091A.setAdapter(b46Var);
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VPullUpRecyclerView vPullUpRecyclerView = new VPullUpRecyclerView(getContext());
        this.f4091A = vPullUpRecyclerView;
        int i = t100.e;
        vPullUpRecyclerView.setPadding(i, 0, i, 0);
        VPullUpRecyclerView vPullUpRecyclerView2 = this.f4091A;
        vPullUpRecyclerView2.addOnItemTouchListener(new C0306a(vPullUpRecyclerView2));
        return this.f4091A;
    }

    public String pageId() {
        return "p_contacts_matches";
    }
}

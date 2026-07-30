package com.p046p1.mobile.putong.core.newui.messages.addressbook;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag;
import com.tantanapp.common.utils.NullChecker;
import p147v.VPullUpRecyclerView;
import p149l.b46;
import p149l.e30;
import p149l.gj0;
import p149l.j36;
import p149l.mkd0;
import p149l.q860;
import p149l.t100;
import p149l.v9j;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookMatchFrag extends PutongFrag implements v9j<String> {

    /* JADX INFO: renamed from: A */
    public VPullUpRecyclerView f25313A;

    /* JADX INFO: renamed from: z */
    public b46 f25314z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag$a */
    public class C8142a extends j36 {
        public C8142a(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // p149l.j36
        /* JADX INFO: renamed from: d */
        public void mo41872d(RecyclerView.AbstractC0566d0 abstractC0566d0) {
            if (NullChecker.m81303a(abstractC0566d0)) {
                KeyEvent.Callback callback = abstractC0566d0.itemView;
                if (callback instanceof gj0) {
                    ((gj0) callback).mo40540b();
                }
            }
        }

        @Override // p149l.j36
        /* JADX INFO: renamed from: f */
        public void mo41873f(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag$b */
    public class C8143b extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f25316a;

        public C8143b(GridLayoutManager gridLayoutManager) {
            this.f25316a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            if (ConversationAddressBookMatchFrag.this.f25314z.m121483H(i) || ConversationAddressBookMatchFrag.this.f25314z.m121484I(i)) {
                return this.f25316a.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m41868N4(Throwable th) {
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
    public /* synthetic */ void m41870Q4(q860 q860Var) {
        this.f25314z.m121487L(q860Var.f153135a);
    }

    @Override // p149l.v9j, java.util.concurrent.Callable
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "配对";
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        CoreModule.f17545c.f19642f0.m32650Fo();
        CoreModule.f17545c.f19588N0.m31972p3(true);
        duringCreated(CoreModule.f17545c.f19642f0.m32960fo()).subscribe(mkd0.m154956H(new e30() { // from class: l.c46
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79155a.m41870Q4((q860) obj);
            }
        }, new e30() { // from class: l.d46
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationAddressBookMatchFrag.m41868N4((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 2);
        gridLayoutManager.m3326v(new C8143b(gridLayoutManager));
        this.f25313A.setLayoutManager(gridLayoutManager);
        b46 b46Var = new b46(this);
        this.f25314z = b46Var;
        this.f25313A.setAdapter(b46Var);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VPullUpRecyclerView vPullUpRecyclerView = new VPullUpRecyclerView(getContext());
        this.f25313A = vPullUpRecyclerView;
        int i = t100.f167256e;
        vPullUpRecyclerView.setPadding(i, 0, i, 0);
        VPullUpRecyclerView vPullUpRecyclerView2 = this.f25313A;
        vPullUpRecyclerView2.addOnItemTouchListener(new C8142a(vPullUpRecyclerView2));
        return this.f25313A;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_contacts_matches";
    }
}

package com.p051p1.mobile.putong.core.newui.messages.addressbook;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag;
import com.tantanapp.common.utils.NullChecker;
import p151v.VPullUpRecyclerView;
import p153l.cj0;
import p153l.g56;
import p153l.o46;
import p153l.pcj;
import p153l.psd0;
import p153l.qa00;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookMatchFrag extends PutongFrag implements pcj<String> {

    /* JADX INFO: renamed from: A */
    public VPullUpRecyclerView f26055A;

    /* JADX INFO: renamed from: z */
    public g56 f26056z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag$a */
    public class C8293a extends o46 {
        public C8293a(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // p153l.o46
        /* JADX INFO: renamed from: d */
        public void mo42883d(RecyclerView.AbstractC0569e0 abstractC0569e0) {
            if (NullChecker.m82486a(abstractC0569e0)) {
                KeyEvent.Callback callback = abstractC0569e0.itemView;
                if (callback instanceof cj0) {
                    ((cj0) callback).mo41551b();
                }
            }
        }

        @Override // p153l.o46
        /* JADX INFO: renamed from: f */
        public void mo42884f(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookMatchFrag$b */
    public class C8294b extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f26058a;

        public C8294b(GridLayoutManager gridLayoutManager) {
            this.f26058a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            if (ConversationAddressBookMatchFrag.this.f26056z.m158455H(i) || ConversationAddressBookMatchFrag.this.f26056z.m158456I(i)) {
                return this.f26058a.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m42879N4(Throwable th) {
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
    public /* synthetic */ void m42881Q4(vg60 vg60Var) {
        this.f26056z.m158459L(vg60Var.f184001a);
    }

    @Override // p153l.pcj, java.util.concurrent.Callable
    /* JADX INFO: renamed from: P4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "配对";
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        CoreModule.f18264c.f20384f0.m33653Fo();
        CoreModule.f18264c.f20330N0.m32975p3(true);
        duringCreated(CoreModule.f18264c.f20384f0.m33963fo()).subscribe(psd0.m173597H(new y20() { // from class: l.h56
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107899a.m42881Q4((vg60) obj);
            }
        }, new y20() { // from class: l.i56
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationAddressBookMatchFrag.m42879N4((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 2);
        gridLayoutManager.m3327v(new C8294b(gridLayoutManager));
        this.f26055A.setLayoutManager(gridLayoutManager);
        g56 g56Var = new g56(this);
        this.f26056z = g56Var;
        this.f26055A.setAdapter(g56Var);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        VPullUpRecyclerView vPullUpRecyclerView = new VPullUpRecyclerView(getContext());
        this.f26055A = vPullUpRecyclerView;
        int i = qa00.f156318e;
        vPullUpRecyclerView.setPadding(i, 0, i, 0);
        VPullUpRecyclerView vPullUpRecyclerView2 = this.f26055A;
        vPullUpRecyclerView2.addOnItemTouchListener(new C8293a(vPullUpRecyclerView2));
        return this.f26055A;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_contacts_matches";
    }
}

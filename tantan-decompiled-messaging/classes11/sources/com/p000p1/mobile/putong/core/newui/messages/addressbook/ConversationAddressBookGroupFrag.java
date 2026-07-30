package com.p000p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.group.GroupSuggestAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import java.util.List;
import l.e30;
import l.f6c0;
import l.mkd0;
import l.t100;
import l.v9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.fi2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationAddressBookGroupFrag extends PutongFrag implements v9j<String> {

    /* JADX INFO: renamed from: z */
    public C0305a f4084z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookGroupFrag$a */
    public static class C0305a extends fi2 {
        public C0305a(PutongFrag putongFrag) {
            super(putongFrag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: S */
        public /* synthetic */ void m5982S(View view) {
            zvf0.r("e_search_entrance", m14440J());
            m14444N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: T */
        public /* synthetic */ void m5983T(View view) {
            zvf0.r("e_find_more_groups", m14440J());
            this.f13017m.startActivity(new Intent((Context) this.f13017m, (Class<?>) GroupSuggestAct.class));
        }

        @Override // p009l.fi2
        /* JADX INFO: renamed from: D */
        public View mo5985D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f13017m.inflater().inflate(f6c0.t, viewGroup, false);
            }
            return i == 2 ? this.f13017m.inflater().inflate(f6c0.q, viewGroup, false) : super.mo5985D(viewGroup, i);
        }

        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void m5984A(final View view, Conversation conversation, int i, int i2) {
            if (i == 2) {
                ((ConversationAddressBookGroupView) view).m5995h(this, conversation);
            } else if (i == 1) {
                xdl0.E0(view, new View.OnClickListener() { // from class: l.t36
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f20548a.m5982S(view2);
                    }
                });
            } else if (i == 0) {
                view.post(new Runnable() { // from class: l.u36
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20970a.m5987U(view);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: U */
        public final /* synthetic */ void m5987U(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) pVar).topMargin = ((xdl0.J(this.f13017m).y - t100.d(200.0f)) / 2) - iArr[1];
            view.setLayoutParams(pVar);
            this.f13008d.setText("你还没有加入或创建群组");
            this.f13007c.setImageResource(x2c0.i0);
            xdl0.M(this.f13009e, true);
            zvf0.x("e_find_more_groups", m14440J());
            xdl0.E0(this.f13009e, new View.OnClickListener() { // from class: l.v36
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f21436a.m5983T(view2);
                }
            });
            xdl0.M(view, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public /* synthetic */ void m5976O4(List list) {
        this.f4084z.m14442L(list);
    }

    /* JADX INFO: renamed from: N4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "群组";
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: f4 */
    public void m5978f4() {
        super.f4();
        duringCreated(CoreModule.c.f0.le()).subscribe(mkd0.G(new e30() { // from class: l.s36
            public final void call(Object obj) {
                this.f20087a.m5976O4((List) obj);
            }
        }));
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(act());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        C0305a c0305a = new C0305a(this);
        this.f4084z = c0305a;
        recyclerView.setAdapter(c0305a);
        return recyclerView;
    }

    public String pageId() {
        return "p_contacts_groups";
    }
}

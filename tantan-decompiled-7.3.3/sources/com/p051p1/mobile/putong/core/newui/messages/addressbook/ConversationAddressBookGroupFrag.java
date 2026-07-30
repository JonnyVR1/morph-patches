package com.p051p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.group.GroupSuggestAct;
import java.util.List;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.kec0;
import p153l.mi2;
import p153l.pcj;
import p153l.psd0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookGroupFrag extends PutongFrag implements pcj<String> {

    /* JADX INFO: renamed from: z */
    public C8292a f26048z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookGroupFrag$a */
    public static class C8292a extends mi2 {
        public C8292a(PutongFrag putongFrag) {
            super(putongFrag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: S */
        public /* synthetic */ void m42864S(View view) {
            i4g0.m138520r("e_search_entrance", m158457J());
            m158461N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: T */
        public /* synthetic */ void m42865T(View view) {
            i4g0.m138520r("e_find_more_groups", m158457J());
            this.f136922m.startActivity(new Intent(this.f136922m, (Class<?>) GroupSuggestAct.class));
        }

        @Override // p153l.mi2, p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f136922m.inflater().inflate(kec0.f126058t, viewGroup, false);
            }
            return i == 2 ? this.f136922m.inflater().inflate(kec0.f126007q, viewGroup, false) : super.mo29824D(viewGroup, i);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void mo29822A(final View view, Conversation conversation, int i, int i2) {
            if (i == 2) {
                ((ConversationAddressBookGroupView) view).m42875h(this, conversation);
            } else if (i == 1) {
                bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.y46
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f197414a.m42864S(view2);
                    }
                });
            } else if (i == 0) {
                view.post(new Runnable() { // from class: l.z46
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f202902a.m42867U(view);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: U */
        public final /* synthetic */ void m42867U(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0580p).topMargin = ((bnl0.m105518J(this.f136922m).y - qa00.m175859d(200.0f)) / 2) - iArr[1];
            view.setLayoutParams(c0580p);
            this.f136913d.setText("你还没有加入或创建群组");
            this.f136912c.setImageResource(dbc0.f87103j0);
            bnl0.m105524M(this.f136914e, true);
            i4g0.m138526x("e_find_more_groups", m158457J());
            bnl0.m105509E0(this.f136914e, new View.OnClickListener() { // from class: l.a56
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f68507a.m42865T(view2);
                }
            });
            bnl0.m105524M(view, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public /* synthetic */ void m42859O4(List list) {
        this.f26048z.m158459L(list);
    }

    @Override // p153l.pcj, java.util.concurrent.Callable
    /* JADX INFO: renamed from: N4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "群组";
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(CoreModule.f18264c.f20384f0.m34028le()).subscribe(psd0.m173596G(new y20() { // from class: l.x46
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f192340a.m42859O4((List) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(act());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        C8292a c8292a = new C8292a(this);
        this.f26048z = c8292a;
        recyclerView.setAdapter(c8292a);
        return recyclerView;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_contacts_groups";
    }
}

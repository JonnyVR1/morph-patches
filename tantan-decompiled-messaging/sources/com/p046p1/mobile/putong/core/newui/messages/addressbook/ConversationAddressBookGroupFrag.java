package com.p046p1.mobile.putong.core.newui.messages.addressbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.group.GroupSuggestAct;
import java.util.List;
import p149l.e30;
import p149l.f6c0;
import p149l.fi2;
import p149l.mkd0;
import p149l.t100;
import p149l.v9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationAddressBookGroupFrag extends PutongFrag implements v9j<String> {

    /* JADX INFO: renamed from: z */
    public C8141a f25306z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookGroupFrag$a */
    public static class C8141a extends fi2 {
        public C8141a(PutongFrag putongFrag) {
            super(putongFrag);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: S */
        public /* synthetic */ void m41853S(View view) {
            zvf0.m220396r("e_search_entrance", m121485J());
            m121489N();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: T */
        public /* synthetic */ void m41854T(View view) {
            zvf0.m220396r("e_find_more_groups", m121485J());
            this.f97616m.startActivity(new Intent(this.f97616m, (Class<?>) GroupSuggestAct.class));
        }

        @Override // p149l.fi2, p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return this.f97616m.inflater().inflate(f6c0.f96004t, viewGroup, false);
            }
            return i == 2 ? this.f97616m.inflater().inflate(f6c0.f95953q, viewGroup, false) : super.mo28825D(viewGroup, i);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public void mo28823A(final View view, Conversation conversation, int i, int i2) {
            if (i == 2) {
                ((ConversationAddressBookGroupView) view).m41864h(this, conversation);
            } else if (i == 1) {
                xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.t36
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f167593a.m41853S(view2);
                    }
                });
            } else if (i == 0) {
                view.post(new Runnable() { // from class: l.u36
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f173574a.m41856U(view);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: U */
        public final /* synthetic */ void m41856U(View view) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0578p).topMargin = ((xdl0.m208338J(this.f97616m).y - t100.m186890d(200.0f)) / 2) - iArr[1];
            view.setLayoutParams(c0578p);
            this.f97607d.setText("你还没有加入或创建群组");
            this.f97606c.setImageResource(x2c0.f190221i0);
            xdl0.m208344M(this.f97608e, true);
            zvf0.m220402x("e_find_more_groups", m121485J());
            xdl0.m208329E0(this.f97608e, new View.OnClickListener() { // from class: l.v36
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f179748a.m41854T(view2);
                }
            });
            xdl0.m208344M(view, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public /* synthetic */ void m41848O4(List list) {
        this.f25306z.m121487L(list);
    }

    @Override // p149l.v9j, java.util.concurrent.Callable
    /* JADX INFO: renamed from: N4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "群组";
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(CoreModule.f17545c.f19642f0.m33025le()).subscribe(mkd0.m154955G(new e30() { // from class: l.s36
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162070a.m41848O4((List) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(act());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        C8141a c8141a = new C8141a(this);
        this.f25306z = c8141a;
        recyclerView.setAdapter(c8141a);
        return recyclerView;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_contacts_groups";
    }
}

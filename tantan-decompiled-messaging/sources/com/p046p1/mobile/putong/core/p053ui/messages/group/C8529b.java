package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.message.R$string;
import java.util.List;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.j7c0;
import p149l.l6c0;
import p149l.nbk;
import p149l.s7m;
import p149l.shk;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.b */
/* JADX INFO: loaded from: classes3.dex */
public class C8529b implements s7m<shk> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f31813a;

    /* JADX INFO: renamed from: b */
    public shk f31814b;

    /* JADX INFO: renamed from: c */
    public GroupRemoveMemberAct f31815c;

    /* JADX INFO: renamed from: d */
    public C8528a f31816d;

    /* JADX INFO: renamed from: e */
    public VText f31817e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.b$a */
    public static class a {
        /* JADX INFO: renamed from: b */
        public static void m49168b(C8529b c8529b, View view) {
            c8529b.f31813a = (VRecyclerView) view;
        }

        /* JADX INFO: renamed from: c */
        public static View m49169c(C8529b c8529b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126593x0, viewGroup, false);
            m49168b(c8529b, viewInflate);
            return viewInflate;
        }
    }

    public C8529b(GroupRemoveMemberAct groupRemoveMemberAct) {
        this.f31815c = groupRemoveMemberAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m49157i(View view) {
        this.f31814b.m184235I0(this.f31816d.m49145H());
        this.f31814b.m184234H0();
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f31815c;
    }

    /* JADX INFO: renamed from: d */
    public View m49158d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a.m49169c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(shk shkVar) {
        this.f31814b = shkVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m49160f(List list) {
        m49165n(list.size());
        this.f31814b.m184235I0(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m49158d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m49161j(Menu menu) {
        this.f31815c.getMenuInflater().inflate(j7c0.f116585a, menu);
        MenuItem menuItemFindItem = menu.findItem(y4c0.f196146i2);
        this.f31817e = (VText) menuItemFindItem.getActionView().findViewById(y4c0.f196142h5);
        xdl0.m208329E0(menuItemFindItem.getActionView(), new View.OnClickListener() { // from class: l.thk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170260a.m49157i(view);
            }
        });
        m49165n(0);
    }

    /* JADX INFO: renamed from: k */
    public void m49162k(List<String> list) {
        this.f31816d.m49147J(list);
    }

    /* JADX INFO: renamed from: l */
    public void m49163l(ChatGroup chatGroup) {
        boolean zEquals = TextUtils.equals(chatGroup.ownerUserId, CoreModule.m29931H().userId());
        GroupRemoveMemberAct groupRemoveMemberAct = this.f31815c;
        groupRemoveMemberAct.setTitle(String.format("%1$s(%2$s)", groupRemoveMemberAct.string(R$string.f20855S2), Integer.valueOf((chatGroup.memberCount - 1) - (zEquals ? 0 : chatGroup.adminUserIds.size()))));
    }

    /* JADX INFO: renamed from: m */
    public void m49164m(List<nbk> list) {
        this.f31816d.m49148K(list);
    }

    /* JADX INFO: renamed from: n */
    public void m49165n(int i) {
        VText vText = this.f31817e;
        if (vText == null) {
            return;
        }
        GroupRemoveMemberAct groupRemoveMemberAct = this.f31815c;
        if (i <= 0) {
            vText.setText(groupRemoveMemberAct.string(R$string.f20884W));
        } else {
            vText.setText(groupRemoveMemberAct.getString(R$string.f20900Y, String.valueOf(i)));
        }
        this.f31817e.setEnabled(i > 0);
    }

    /* JADX INFO: renamed from: r */
    public void m49166r() {
        this.f31813a.setLayoutManager(new LinearLayoutManager(this.f31815c, 1, false));
        C8528a c8528a = new C8528a(this.f31815c, new C8528a.a() { // from class: l.uhk
            @Override // com.p046p1.mobile.putong.core.p053ui.messages.group.C8528a.a
            /* JADX INFO: renamed from: a */
            public final void mo49149a(List list) {
                this.f176557a.m49160f(list);
            }
        });
        this.f31816d = c8528a;
        this.f31813a.setAdapter(c8528a);
    }
}

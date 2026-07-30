package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.message.R$string;
import java.util.List;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.dek;
import p153l.edc0;
import p153l.iam;
import p153l.ikk;
import p153l.nfc0;
import p153l.qec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.b */
/* JADX INFO: loaded from: classes3.dex */
public class C8692b implements iam<ikk> {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f32661a;

    /* JADX INFO: renamed from: b */
    public ikk f32662b;

    /* JADX INFO: renamed from: c */
    public GroupRemoveMemberAct f32663c;

    /* JADX INFO: renamed from: d */
    public C8691a f32664d;

    /* JADX INFO: renamed from: e */
    public VText f32665e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.b$a */
    public static class a {
        /* JADX INFO: renamed from: b */
        public static void m50351b(C8692b c8692b, View view) {
            c8692b.f32661a = (VRecyclerView) view;
        }

        /* JADX INFO: renamed from: c */
        public static View m50352c(C8692b c8692b, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157149x0, viewGroup, false);
            m50351b(c8692b, viewInflate);
            return viewInflate;
        }
    }

    public C8692b(GroupRemoveMemberAct groupRemoveMemberAct) {
        this.f32663c = groupRemoveMemberAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m50340i(View view) {
        this.f32662b.m140403I0(this.f32664d.m50328H());
        this.f32662b.m140402H0();
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f32663c;
    }

    /* JADX INFO: renamed from: d */
    public View m50341d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a.m50352c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ikk ikkVar) {
        this.f32662b = ikkVar;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m50343f(List list) {
        m50348n(list.size());
        this.f32662b.m140403I0(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m50341d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m50344j(Menu menu) {
        this.f32663c.getMenuInflater().inflate(nfc0.f141721a, menu);
        MenuItem menuItemFindItem = menu.findItem(edc0.f93381i2);
        this.f32665e = (VText) menuItemFindItem.getActionView().findViewById(edc0.f93377h5);
        bnl0.m105509E0(menuItemFindItem.getActionView(), new View.OnClickListener() { // from class: l.jkk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121422a.m50340i(view);
            }
        });
        m50348n(0);
    }

    /* JADX INFO: renamed from: k */
    public void m50345k(List<String> list) {
        this.f32664d.m50330J(list);
    }

    /* JADX INFO: renamed from: l */
    public void m50346l(ChatGroup chatGroup) {
        boolean zEquals = TextUtils.equals(chatGroup.ownerUserId, CoreModule.m30929H().userId());
        GroupRemoveMemberAct groupRemoveMemberAct = this.f32663c;
        groupRemoveMemberAct.setTitle(String.format("%1$s(%2$s)", groupRemoveMemberAct.string(R$string.f21597S2), Integer.valueOf((chatGroup.memberCount - 1) - (zEquals ? 0 : chatGroup.adminUserIds.size()))));
    }

    /* JADX INFO: renamed from: m */
    public void m50347m(List<dek> list) {
        this.f32664d.m50331K(list);
    }

    /* JADX INFO: renamed from: n */
    public void m50348n(int i) {
        VText vText = this.f32665e;
        if (vText == null) {
            return;
        }
        GroupRemoveMemberAct groupRemoveMemberAct = this.f32663c;
        if (i <= 0) {
            vText.setText(groupRemoveMemberAct.string(R$string.f21626W));
        } else {
            vText.setText(groupRemoveMemberAct.getString(R$string.f21642Y, String.valueOf(i)));
        }
        this.f32665e.setEnabled(i > 0);
    }

    /* JADX INFO: renamed from: r */
    public void m50349r() {
        this.f32661a.setLayoutManager(new LinearLayoutManager(this.f32663c, 1, false));
        C8691a c8691a = new C8691a(this.f32663c, new C8691a.a() { // from class: l.kkk
            @Override // com.p051p1.mobile.putong.core.p058ui.messages.group.C8691a.a
            /* JADX INFO: renamed from: a */
            public final void mo50332a(List list) {
                this.f127210a.m50343f(list);
            }
        });
        this.f32664d = c8691a;
        this.f32661a.setAdapter(c8691a);
    }
}

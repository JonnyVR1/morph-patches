package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.navigationbar.VNavigationBar;
import p149l.e30;
import p149l.f6c0;
import p149l.lsi0;
import p149l.u4c0;
import p149l.upa;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class UploadImageReplaceAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public User f26756c;

    /* JADX INFO: renamed from: d */
    public ArrayList<View> f26757d;

    /* JADX INFO: renamed from: e */
    public ArrayList<AutoVDraweeView> f26758e;

    /* JADX INFO: renamed from: f */
    public ArrayList<TextView> f26759f;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m43516Y1(Act act) {
        return new Intent(act, (Class<?>) UploadImageReplaceAct.class);
    }

    /* JADX INFO: renamed from: Z1 */
    private void m43517Z1(User user) {
        List<Media> list = user.pictures;
        int iMin = Math.min(list.size(), this.f26758e.size());
        for (final int i = 0; i < iMin; i++) {
            xdl0.m208344M(this.f26757d.get(i), true);
            this.f26759f.get(i).setText("头像");
            if (vwb.m200296J(list.get(i).tags) || i == 0) {
                if (i == 0) {
                    xdl0.m208344M(this.f26759f.get(i), true);
                }
            } else if (upa.m194609A2()) {
                xdl0.m208344M(this.f26759f.get(i), false);
            } else {
                this.f26759f.get(i).setText(ura.m195053e().m195057d().mo33691Gh(list.get(i).tags.get(0)).name);
                xdl0.m208344M(this.f26759f.get(i), true);
            }
            this.f26758e.get(i).setImageUrl(list.get(i).cover().url);
            if (i > 0) {
                xdl0.m208329E0(this.f26757d.get(i), new View.OnClickListener() { // from class: l.fuj0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f99345a.m43518a2(i, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m43518a2(int i, View view) {
        lsi0.m151588r("select index is:" + i);
        zvf0.m220396r("e_choose_photo_replace", pageId());
        Intent intent = new Intent();
        intent.putExtra("EXTRA_REPLACE_INDEX", i);
        setResult(-1, intent);
        m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m43517Z1(this.f26756c);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.act).inflate(f6c0.f95439Kc, (ViewGroup) null);
        ((VNavigationBar) viewInflate.findViewById(u4c0.f173912L8)).setLeftIconAsBack(this.act);
        View viewFindViewById = viewInflate.findViewById(u4c0.f173930M9);
        VText_Medium vText_Medium = (VText_Medium) viewInflate.findViewById(u4c0.f173884Je);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174129Y9);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) viewInflate.findViewById(u4c0.f174568y9);
        View viewFindViewById2 = viewInflate.findViewById(u4c0.f173947N9);
        TextView textView2 = (TextView) viewInflate.findViewById(u4c0.f174145Z9);
        AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) viewInflate.findViewById(u4c0.f174585z9);
        View viewFindViewById3 = viewInflate.findViewById(u4c0.f173964O9);
        TextView textView3 = (TextView) viewInflate.findViewById(u4c0.f174162aa);
        AutoVDraweeView autoVDraweeView3 = (AutoVDraweeView) viewInflate.findViewById(u4c0.f173726A9);
        View viewFindViewById4 = viewInflate.findViewById(u4c0.f173981P9);
        TextView textView4 = (TextView) viewInflate.findViewById(u4c0.f174179ba);
        AutoVDraweeView autoVDraweeView4 = (AutoVDraweeView) viewInflate.findViewById(u4c0.f173743B9);
        View viewFindViewById5 = viewInflate.findViewById(u4c0.f173998Q9);
        TextView textView5 = (TextView) viewInflate.findViewById(u4c0.f174196ca);
        AutoVDraweeView autoVDraweeView5 = (AutoVDraweeView) viewInflate.findViewById(u4c0.f173760C9);
        View viewFindViewById6 = viewInflate.findViewById(u4c0.f174015R9);
        TextView textView6 = (TextView) viewInflate.findViewById(u4c0.f174213da);
        AutoVDraweeView autoVDraweeView6 = (AutoVDraweeView) viewInflate.findViewById(u4c0.f173777D9);
        View viewFindViewById7 = viewInflate.findViewById(u4c0.f174032S9);
        TextView textView7 = (TextView) viewInflate.findViewById(u4c0.f174230ea);
        AutoVDraweeView autoVDraweeView7 = (AutoVDraweeView) viewInflate.findViewById(u4c0.f173794E9);
        View viewFindViewById8 = viewInflate.findViewById(u4c0.f174049T9);
        TextView textView8 = (TextView) viewInflate.findViewById(u4c0.f174247fa);
        AutoVDraweeView autoVDraweeView8 = (AutoVDraweeView) viewInflate.findViewById(u4c0.f173811F9);
        View viewFindViewById9 = viewInflate.findViewById(u4c0.f174065U9);
        TextView textView9 = (TextView) viewInflate.findViewById(u4c0.f174264ga);
        AutoVDraweeView autoVDraweeView9 = (AutoVDraweeView) viewInflate.findViewById(u4c0.f173828G9);
        if (!upa.m194609A2()) {
            this.f26757d = vwb.m200324f0(viewFindViewById, viewFindViewById2, viewFindViewById3, viewFindViewById4, viewFindViewById5, viewFindViewById6, viewFindViewById7, viewFindViewById8, viewFindViewById9);
            this.f26759f = vwb.m200324f0(textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
            this.f26758e = vwb.m200324f0(autoVDraweeView, autoVDraweeView2, autoVDraweeView3, autoVDraweeView4, autoVDraweeView5, autoVDraweeView6, autoVDraweeView7, autoVDraweeView8, autoVDraweeView9);
            return viewInflate;
        }
        vText_Medium.setText("照片已达到6张，请从非头像照片中选择一张替换");
        this.f26757d = vwb.m200324f0(viewFindViewById, viewFindViewById2, viewFindViewById3, viewFindViewById4, viewFindViewById5, viewFindViewById6);
        this.f26759f = vwb.m200324f0(textView, textView2, textView3, textView4, textView5, textView6);
        this.f26758e = vwb.m200324f0(autoVDraweeView, autoVDraweeView2, autoVDraweeView3, autoVDraweeView4, autoVDraweeView5, autoVDraweeView6);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f26756c = CoreModule.f17545c.f19639e0.m169520na();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.euj0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93243a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_choose_photo_replace";
    }
}

package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.f6c0;
import l.lsi0;
import l.u4c0;
import l.upa;
import l.ura;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class UploadImageReplaceAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public User f5534c;

    /* JADX INFO: renamed from: d */
    public ArrayList<View> f5535d;

    /* JADX INFO: renamed from: e */
    public ArrayList<AutoVDraweeView> f5536e;

    /* JADX INFO: renamed from: f */
    public ArrayList<TextView> f5537f;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m7762Y1(Act act) {
        return new Intent((Context) act, (Class<?>) UploadImageReplaceAct.class);
    }

    /* JADX INFO: renamed from: Z1 */
    private void m7763Z1(User user) {
        List list = user.pictures;
        int iMin = Math.min(list.size(), this.f5536e.size());
        for (final int i = 0; i < iMin; i++) {
            xdl0.M(this.f5535d.get(i), true);
            this.f5537f.get(i).setText("头像");
            if (vwb.J(((Media) list.get(i)).tags) || i == 0) {
                if (i == 0) {
                    xdl0.M(this.f5537f.get(i), true);
                }
            } else if (upa.A2()) {
                xdl0.M(this.f5537f.get(i), false);
            } else {
                this.f5537f.get(i).setText(ura.e().d().Gh((String) ((Media) list.get(i)).tags.get(0)).name);
                xdl0.M(this.f5537f.get(i), true);
            }
            this.f5536e.get(i).setImageUrl(((Media) ((Media) list.get(i)).cover()).url);
            if (i > 0) {
                xdl0.E0(this.f5535d.get(i), new View.OnClickListener() { // from class: l.fuj0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f13174a.m7764a2(i, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m7764a2(int i, View view) {
        lsi0.r("select index is:" + i);
        zvf0.r("e_choose_photo_replace", pageId());
        Intent intent = new Intent();
        intent.putExtra("EXTRA_REPLACE_INDEX", i);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m7763Z1(this.f5534c);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(((Act) this).act).inflate(f6c0.Kc, (ViewGroup) null);
        viewInflate.findViewById(u4c0.L8).setLeftIconAsBack(((Act) this).act);
        View viewFindViewById = viewInflate.findViewById(u4c0.M9);
        VText_Medium vText_MediumFindViewById = viewInflate.findViewById(u4c0.Je);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.Y9);
        AutoVDraweeView autoVDraweeViewFindViewById = viewInflate.findViewById(u4c0.y9);
        View viewFindViewById2 = viewInflate.findViewById(u4c0.N9);
        TextView textView2 = (TextView) viewInflate.findViewById(u4c0.Z9);
        AutoVDraweeView autoVDraweeViewFindViewById2 = viewInflate.findViewById(u4c0.z9);
        View viewFindViewById3 = viewInflate.findViewById(u4c0.O9);
        TextView textView3 = (TextView) viewInflate.findViewById(u4c0.aa);
        AutoVDraweeView autoVDraweeViewFindViewById3 = viewInflate.findViewById(u4c0.A9);
        View viewFindViewById4 = viewInflate.findViewById(u4c0.P9);
        TextView textView4 = (TextView) viewInflate.findViewById(u4c0.ba);
        AutoVDraweeView autoVDraweeViewFindViewById4 = viewInflate.findViewById(u4c0.B9);
        View viewFindViewById5 = viewInflate.findViewById(u4c0.Q9);
        TextView textView5 = (TextView) viewInflate.findViewById(u4c0.ca);
        AutoVDraweeView autoVDraweeViewFindViewById5 = viewInflate.findViewById(u4c0.C9);
        View viewFindViewById6 = viewInflate.findViewById(u4c0.R9);
        TextView textView6 = (TextView) viewInflate.findViewById(u4c0.da);
        AutoVDraweeView autoVDraweeViewFindViewById6 = viewInflate.findViewById(u4c0.D9);
        View viewFindViewById7 = viewInflate.findViewById(u4c0.S9);
        TextView textView7 = (TextView) viewInflate.findViewById(u4c0.ea);
        AutoVDraweeView autoVDraweeViewFindViewById7 = viewInflate.findViewById(u4c0.E9);
        View viewFindViewById8 = viewInflate.findViewById(u4c0.T9);
        TextView textView8 = (TextView) viewInflate.findViewById(u4c0.fa);
        AutoVDraweeView autoVDraweeViewFindViewById8 = viewInflate.findViewById(u4c0.F9);
        View viewFindViewById9 = viewInflate.findViewById(u4c0.U9);
        TextView textView9 = (TextView) viewInflate.findViewById(u4c0.ga);
        AutoVDraweeView autoVDraweeViewFindViewById9 = viewInflate.findViewById(u4c0.G9);
        if (!upa.A2()) {
            this.f5535d = vwb.f0(new View[]{viewFindViewById, viewFindViewById2, viewFindViewById3, viewFindViewById4, viewFindViewById5, viewFindViewById6, viewFindViewById7, viewFindViewById8, viewFindViewById9});
            this.f5537f = vwb.f0(new TextView[]{textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9});
            this.f5536e = vwb.f0(new AutoVDraweeView[]{autoVDraweeViewFindViewById, autoVDraweeViewFindViewById2, autoVDraweeViewFindViewById3, autoVDraweeViewFindViewById4, autoVDraweeViewFindViewById5, autoVDraweeViewFindViewById6, autoVDraweeViewFindViewById7, autoVDraweeViewFindViewById8, autoVDraweeViewFindViewById9});
            return viewInflate;
        }
        vText_MediumFindViewById.setText("照片已达到6张，请从非头像照片中选择一张替换");
        this.f5535d = vwb.f0(new View[]{viewFindViewById, viewFindViewById2, viewFindViewById3, viewFindViewById4, viewFindViewById5, viewFindViewById6});
        this.f5537f = vwb.f0(new TextView[]{textView, textView2, textView3, textView4, textView5, textView6});
        this.f5536e = vwb.f0(new AutoVDraweeView[]{autoVDraweeViewFindViewById, autoVDraweeViewFindViewById2, autoVDraweeViewFindViewById3, autoVDraweeViewFindViewById4, autoVDraweeViewFindViewById5, autoVDraweeViewFindViewById6});
        return viewInflate;
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5534c = CoreModule.c.e0.na();
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.euj0
            public final void call(Object obj) {
                this.f12692a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    public String pageId() {
        return "p_choose_photo_replace";
    }
}

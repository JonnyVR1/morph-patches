package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.navigationbar.VNavigationBar;
import p153l.adc0;
import p153l.bnl0;
import p153l.gra;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.kec0;
import p153l.o1j0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class UploadImageReplaceAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public User f27604c;

    /* JADX INFO: renamed from: d */
    public ArrayList<View> f27605d;

    /* JADX INFO: renamed from: e */
    public ArrayList<AutoVDraweeView> f27606e;

    /* JADX INFO: renamed from: f */
    public ArrayList<TextView> f27607f;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m44702Z1(Act act) {
        return new Intent(act, (Class<?>) UploadImageReplaceAct.class);
    }

    /* JADX INFO: renamed from: a2 */
    private void m44703a2(User user) {
        List<Media> list = user.pictures;
        int iMin = Math.min(list.size(), this.f27606e.size());
        for (final int i = 0; i < iMin; i++) {
            bnl0.m105524M(this.f27605d.get(i), true);
            this.f27607f.get(i).setText("头像");
            if (jyb.m147479J(list.get(i).tags) || i == 0) {
                if (i == 0) {
                    bnl0.m105524M(this.f27607f.get(i), true);
                }
            } else if (gra.m131540A2()) {
                bnl0.m105524M(this.f27607f.get(i), false);
            } else {
                this.f27607f.get(i).setText(gta.m132210e().m132214d().mo34694Gh(list.get(i).tags.get(0)).name);
                bnl0.m105524M(this.f27607f.get(i), true);
            }
            this.f27606e.get(i).setImageUrl(list.get(i).cover().url);
            if (i > 0) {
                bnl0.m105509E0(this.f27605d.get(i), new View.OnClickListener() { // from class: l.i3k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f112733a.m44704b2(i, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m44704b2(int i, View view) {
        o1j0.m165644r("select index is:" + i);
        i4g0.m138520r("e_choose_photo_replace", pageId());
        Intent intent = new Intent();
        intent.putExtra("EXTRA_REPLACE_INDEX", i);
        setResult(-1, intent);
        m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        m44703a2(this.f27604c);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.act).inflate(kec0.f125605Rc, (ViewGroup) null);
        ((VNavigationBar) viewInflate.findViewById(adc0.f70034N8)).setLeftIconAsBack(this.act);
        View viewFindViewById = viewInflate.findViewById(adc0.f70052O9);
        VText_Medium vText_Medium = (VText_Medium) viewInflate.findViewById(adc0.f70023Me);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70253aa);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) viewInflate.findViewById(adc0.f69814A9);
        View viewFindViewById2 = viewInflate.findViewById(adc0.f70069P9);
        TextView textView2 = (TextView) viewInflate.findViewById(adc0.f70270ba);
        AutoVDraweeView autoVDraweeView2 = (AutoVDraweeView) viewInflate.findViewById(adc0.f69831B9);
        View viewFindViewById3 = viewInflate.findViewById(adc0.f70086Q9);
        TextView textView3 = (TextView) viewInflate.findViewById(adc0.f70287ca);
        AutoVDraweeView autoVDraweeView3 = (AutoVDraweeView) viewInflate.findViewById(adc0.f69848C9);
        View viewFindViewById4 = viewInflate.findViewById(adc0.f70103R9);
        TextView textView4 = (TextView) viewInflate.findViewById(adc0.f70304da);
        AutoVDraweeView autoVDraweeView4 = (AutoVDraweeView) viewInflate.findViewById(adc0.f69865D9);
        View viewFindViewById5 = viewInflate.findViewById(adc0.f70120S9);
        TextView textView5 = (TextView) viewInflate.findViewById(adc0.f70321ea);
        AutoVDraweeView autoVDraweeView5 = (AutoVDraweeView) viewInflate.findViewById(adc0.f69882E9);
        View viewFindViewById6 = viewInflate.findViewById(adc0.f70137T9);
        TextView textView6 = (TextView) viewInflate.findViewById(adc0.f70338fa);
        AutoVDraweeView autoVDraweeView6 = (AutoVDraweeView) viewInflate.findViewById(adc0.f69899F9);
        View viewFindViewById7 = viewInflate.findViewById(adc0.f70154U9);
        TextView textView7 = (TextView) viewInflate.findViewById(adc0.f70355ga);
        AutoVDraweeView autoVDraweeView7 = (AutoVDraweeView) viewInflate.findViewById(adc0.f69916G9);
        View viewFindViewById8 = viewInflate.findViewById(adc0.f70171V9);
        TextView textView8 = (TextView) viewInflate.findViewById(adc0.f70372ha);
        AutoVDraweeView autoVDraweeView8 = (AutoVDraweeView) viewInflate.findViewById(adc0.f69933H9);
        View viewFindViewById9 = viewInflate.findViewById(adc0.f70188W9);
        TextView textView9 = (TextView) viewInflate.findViewById(adc0.f70389ia);
        AutoVDraweeView autoVDraweeView9 = (AutoVDraweeView) viewInflate.findViewById(adc0.f69950I9);
        if (!gra.m131540A2()) {
            this.f27605d = jyb.m147507f0(viewFindViewById, viewFindViewById2, viewFindViewById3, viewFindViewById4, viewFindViewById5, viewFindViewById6, viewFindViewById7, viewFindViewById8, viewFindViewById9);
            this.f27607f = jyb.m147507f0(textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
            this.f27606e = jyb.m147507f0(autoVDraweeView, autoVDraweeView2, autoVDraweeView3, autoVDraweeView4, autoVDraweeView5, autoVDraweeView6, autoVDraweeView7, autoVDraweeView8, autoVDraweeView9);
            return viewInflate;
        }
        vText_Medium.setText("照片已达到6张，请从非头像照片中选择一张替换");
        this.f27605d = jyb.m147507f0(viewFindViewById, viewFindViewById2, viewFindViewById3, viewFindViewById4, viewFindViewById5, viewFindViewById6);
        this.f27607f = jyb.m147507f0(textView, textView2, textView3, textView4, textView5, textView6);
        this.f27606e = jyb.m147507f0(autoVDraweeView, autoVDraweeView2, autoVDraweeView3, autoVDraweeView4, autoVDraweeView5, autoVDraweeView6);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f27604c = CoreModule.f18264c.f20381e0.m116593na();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.h3k0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107668a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_choose_photo_replace";
    }
}

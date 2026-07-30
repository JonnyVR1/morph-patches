package com.p051p1.mobile.putong.account.p055ui.camera;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.C20695uy;
import p153l.r00;

/* JADX INFO: loaded from: classes9.dex */
public class AccountVideoRecordFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public r00 f17393A;

    /* JADX INFO: renamed from: z */
    public C20695uy f17394z;

    /* JADX INFO: renamed from: M4 */
    public static void m29787M4(AccountVideoRecordFrag accountVideoRecordFrag, MusicContent musicContent, boolean z, boolean z2, int i, String str, boolean z3, ArrayList<Media> arrayList, String str2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_music_content", musicContent);
        bundle.putBoolean("extra_has_video", z);
        bundle.putBoolean("extra_is_add_image", z2);
        bundle.putInt("extra_image_count", i);
        bundle.putString("extra_from", str);
        bundle.putBoolean("extra_show_only_photo", z3);
        bundle.putSerializable("extra_selected_images", arrayList);
        bundle.putString("extra_selected_folder_path", str2);
        accountVideoRecordFrag.setArguments(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f17393A.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        super.mo21593n4(bundle);
        if (NullChecker.m82486a(((PutongAct) getActivity()).getSupportActionBar())) {
            ((PutongAct) getActivity()).getSupportActionBar().mo102186m();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m29788o() {
        this.f17393A.m179090P0();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001) {
            this.f17393A.m179187y2((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17394z = new C20695uy(this);
        r00 r00Var = new r00(this);
        this.f17393A = r00Var;
        this.f17394z.mo52715C(r00Var);
        this.f17394z.m198566m0(getArguments());
    }
}

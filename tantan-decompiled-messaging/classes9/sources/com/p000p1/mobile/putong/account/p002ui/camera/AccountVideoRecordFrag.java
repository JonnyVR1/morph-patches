package com.p000p1.mobile.putong.account.p002ui.camera;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p006l.C0537az;
import p006l.x00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountVideoRecordFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public x00 f663A;

    /* JADX INFO: renamed from: z */
    public C0537az f664z;

    /* JADX INFO: renamed from: M4 */
    public static void m687M4(AccountVideoRecordFrag accountVideoRecordFrag, MusicContent musicContent, boolean z, boolean z2, int i, String str, boolean z3, ArrayList<Media> arrayList, String str2) {
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

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f663A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m688n4(Bundle bundle) {
        super.n4(bundle);
        if (NullChecker.a(getActivity().getSupportActionBar())) {
            getActivity().getSupportActionBar().m();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m689o() {
        this.f663A.m27039P0();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1001) {
            this.f663A.m27133y2((MusicContent) intent.getSerializableExtra("result_selected"));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f664z = new C0537az(this);
        x00 x00Var = new x00(this);
        this.f663A = x00Var;
        this.f664z.C(x00Var);
        this.f664z.m12334m0(getArguments());
    }
}

package com.p000p1.mobile.putong.core.newui.fake;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.Media;
import java.util.ArrayList;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FakeHoldFragment extends Frag {

    /* JADX INFO: renamed from: A */
    public InterfaceC0008a f211A;

    /* JADX INFO: renamed from: C */
    public Intent f213C;

    /* JADX INFO: renamed from: z */
    public int f214z = 16;

    /* JADX INFO: renamed from: B */
    public String f212B = "";

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.fake.FakeHoldFragment$a */
    public interface InterfaceC0008a {
        /* JADX INFO: renamed from: a */
        void mo326a(ArrayList<Media> arrayList, String str);

        default void onError() {
        }
    }

    /* JADX INFO: renamed from: z4 */
    public static FakeHoldFragment m324z4(int i, Intent intent, InterfaceC0008a interfaceC0008a) {
        FakeHoldFragment fakeHoldFragment = new FakeHoldFragment();
        fakeHoldFragment.f214z = i;
        fakeHoldFragment.f211A = interfaceC0008a;
        fakeHoldFragment.f213C = intent;
        return fakeHoldFragment;
    }

    /* JADX INFO: renamed from: A4 */
    public void m325A4(FragmentManager fragmentManager) {
        fragmentManager.m().e(this, (String) null).j();
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        Intent intent = this.f213C;
        if (intent == null) {
            startActivityForResult(MediaPickerAct.m9216X1(act(), MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(1).withImageCropProportion(0.8f).withImageCropWidth(xdl0.y0() - t100.d(40.0f)).build()).withFromType(1).build()), this.f214z);
        } else {
            startActivityForResult(intent, this.f214z);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != this.f214z) {
            return;
        }
        InterfaceC0008a interfaceC0008a = this.f211A;
        if (interfaceC0008a != null) {
            if (i2 == -1) {
                this.f211A.mo326a((ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h), intent.getStringExtra("from"));
            } else {
                interfaceC0008a.onError();
            }
        }
        if (getFragmentManager() != null) {
            getFragmentManager().m().r(this).j();
        }
    }
}

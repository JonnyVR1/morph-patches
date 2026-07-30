package com.tantanapp.media.ttmediaeffect.mask;

import android.content.Context;
import com.momo.mcamera.mask.MaskModel;
import com.momo.mcamera.mask.MaskStore;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class TTMaskStore {
    private static TTMaskStore ourInstance = new TTMaskStore();
    private MaskStore maskStore = MaskStore.getInstance();

    private TTMaskStore() {
    }

    public static TTMaskStore getInstance() {
        return ourInstance;
    }

    private static List<TTMaskModel> toTTMaskModel(List<MaskModel> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (MaskModel maskModel : list) {
                if (maskModel != null) {
                    arrayList.add(new TTMaskModel(maskModel));
                }
            }
        }
        return arrayList;
    }

    public void addGestureMasks(Context context, TTMaskModel tTMaskModel) {
        if (this.maskStore.getGestureMasks(context) != null) {
            this.maskStore.getGestureMasks(context).add(tTMaskModel.getMaskModel());
        }
    }

    public void addMasks(Context context, TTMaskModel tTMaskModel) {
        if (this.maskStore.getMasks(context) != null) {
            this.maskStore.getMasks(context).add(tTMaskModel.getMaskModel());
        }
    }

    public String getFolderPath() {
        return this.maskStore.getFolderPath();
    }

    public List<TTMaskModel> getGestureMasks(Context context) {
        return toTTMaskModel(this.maskStore.getGestureMasks(context));
    }

    public TTMaskModel getMask(Context context, String str) {
        return new TTMaskModel(this.maskStore.getMask(context, str));
    }

    public List<TTMaskModel> getMasks(Context context) {
        return toTTMaskModel(this.maskStore.getMasks(context));
    }

    public void removeGestureMasks(Context context, TTMaskModel tTMaskModel) {
        if (this.maskStore.getGestureMasks(context) != null) {
            this.maskStore.getGestureMasks(context).remove(tTMaskModel.getMaskModel());
        }
    }

    public void removeMasks(Context context, TTMaskModel tTMaskModel) {
        if (this.maskStore.getMasks(context) != null) {
            this.maskStore.getMasks(context).remove(tTMaskModel.getMaskModel());
        }
    }

    public void setFolderPath(String str) {
        this.maskStore.setFolderPath(str);
    }
}

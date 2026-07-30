package com.momo.mcamera.mask;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.core.glcore.util.FileUtil;
import com.core.glcore.util.JsonUtil;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.filtermanager.MMPresetFilterStore;
import com.momo.mcamera.mask.bean.EffectFilterItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class MaskStore {
    private static MaskStore ourInstance = new MaskStore();
    private final String PATH_FOLDER = "stickers";
    private String folderPath;

    private MaskStore() {
    }

    public static MaskStore getInstance() {
        return ourInstance;
    }

    private String getMaskFolder(Context context, String str) {
        return Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + str;
    }

    private List<MaskModel> getMasksByFolderName(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        FileUtil.checkFile(getMaskFolder(context, str));
        File[] fileArrListFiles = new File(getMaskFolder(context, str)).listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles);
            for (File file : fileArrListFiles) {
                MaskModel mask = getMask(context, file.getPath());
                if (mask != null) {
                    arrayList.add(mask);
                    for (Sticker sticker : mask.getStickers()) {
                        sticker.setFrameRate(mask.frameRate);
                        sticker.setImageFolderPath(file.getPath());
                    }
                }
            }
        }
        return arrayList;
    }

    public String getFolderPath() {
        return this.folderPath;
    }

    public List<MaskModel> getGestureMasks(Context context) {
        return getMasksByFolderName(context, "MaskG");
    }

    public MaskModel getMask(Context context, String str) {
        float[] fArr;
        File file = new File(str);
        String str2 = file.getPath() + "/params.txt";
        if (!FileUtil.exist(str2)) {
            str2 = file.getPath() + "/params.json";
        }
        String strJsonStringFromFile = JsonUtil.getInstance().jsonStringFromFile(context, str2);
        if (!TextUtils.isEmpty(strJsonStringFromFile)) {
            try {
                MaskModel maskModel = (MaskModel) JsonUtil.getInstance().fromJson(strJsonStringFromFile, MaskModel.class);
                if (maskModel.getStickers() == null) {
                    maskModel.setStickers(new ArrayList());
                }
                if (FileUtil.exist(file.getPath() + "/preview.png")) {
                    maskModel.setPreviewPath(file.getPath() + "/preview.png");
                } else {
                    Iterator<Sticker> it = maskModel.getStickers().iterator();
                    if (it.hasNext()) {
                        Sticker next = it.next();
                        next.setImageFolderPath(str);
                        maskModel.setPreviewPath(next.getImagePathByIndex(context, 0));
                    }
                }
                if (!TextUtils.isEmpty(maskModel.getSound())) {
                    maskModel.setSoundPath(file.getPath() + "/" + maskModel.getSound());
                }
                maskModel.setFolderPath(str);
                if (maskModel.getLookUpFilters() != null) {
                    for (LookUpModel lookUpModel : maskModel.getLookUpFilters()) {
                        lookUpModel.setPresetFilter(MMPresetFilterStore.getPresetFilterByFolder(context, file.getPath() + "/" + lookUpModel.getFolder()));
                        Sticker sticker = new Sticker();
                        sticker.setOrderedIndex(maskModel.getOrderedIndex());
                        sticker.setStickerType("FACE_LOOK_UP_TYPE");
                        sticker.setTriggerType(lookUpModel.getTriggerType());
                        sticker.setLookUpModel(lookUpModel);
                        sticker.setHiddenTriggerType(lookUpModel.getHiddenTriggerType());
                        maskModel.getStickers().add(0, sticker);
                    }
                }
                if (maskModel.getMasks() != null) {
                    for (Mask mask : maskModel.getMasks()) {
                        Mask mask2 = (Mask) JsonUtil.getInstance().fromJson(JsonUtil.getInstance().jsonStringFromFile(context, file.getPath() + "/" + mask.getFolder() + "/metadata.json"), Mask.class);
                        if (mask2 != null && (fArr = mask2.landmarks) != null) {
                            mask.landmarks = fArr;
                            mask.setTexturePath(file.getPath() + "/" + mask.getFolder() + "/texture.png");
                            Sticker sticker2 = new Sticker();
                            sticker2.setOrderedIndex(maskModel.getOrderedIndex());
                            sticker2.setStickerType("FACE_MASK_TYPE");
                            sticker2.setTriggerType(mask.getTriggerType());
                            sticker2.setHiddenTriggerType(mask.getHiddenTriggerType());
                            sticker2.setMask(mask);
                            maskModel.getStickers().add(0, sticker2);
                        }
                    }
                }
                if (maskModel.getDistortionList() != null) {
                    for (Mask mask3 : maskModel.getDistortionList()) {
                        maskModel.setFaceScale(mask3.getStrength());
                        maskModel.setFaceFacialFeatureScale(mask3.getStrengthB());
                        maskModel.setWrapType(mask3.getType());
                        int triggerType = mask3.getTriggerType();
                        int hiddenTriggerType = mask3.getHiddenTriggerType();
                        Sticker sticker3 = new Sticker();
                        sticker3.setOrderedIndex(maskModel.getOrderedIndex());
                        sticker3.setTriggerType(triggerType);
                        sticker3.setHiddenTriggerType(hiddenTriggerType);
                        sticker3.setMask(mask3);
                        maskModel.getStickers().add(0, sticker3);
                    }
                }
                Sticker sticker4 = maskModel.spectrumSticker;
                if (sticker4 != null) {
                    sticker4.setStickerType("STICKER_TYPE_VOICE");
                    maskModel.getStickers().add(maskModel.spectrumSticker);
                }
                for (Sticker sticker5 : maskModel.getStickers()) {
                    sticker5.setFrameRate(maskModel.frameRate);
                    sticker5.setImageFolderPath(file.getPath());
                    sticker5.setOrderedIndex(maskModel.getOrderedIndex());
                    if ("3d".equals(sticker5.getLayerType())) {
                        String strSubstring = str.substring(0, str.lastIndexOf("/"));
                        maskModel.setXengineEsPath(strSubstring);
                        sticker5.setXengineEsPath(strSubstring);
                    }
                    if (maskModel.getAdditionalInfo() != null) {
                        sticker5.setComic(maskModel.getAdditionalInfo().isComic());
                    }
                    if (Sticker.LAYER_TYPE_VIDEO_FILE.equals(sticker5.getLayerType())) {
                        String str3 = str + "/" + sticker5.getImagePreName() + "/config.json";
                        if (FileUtil.exist(str3)) {
                            String strJsonStringFromFile2 = JsonUtil.getInstance().jsonStringFromFile(context, str3);
                            if (!TextUtils.isEmpty(strJsonStringFromFile2)) {
                                try {
                                    Sticker.VideoFileConfig videoFileConfig = (Sticker.VideoFileConfig) JsonUtil.getInstance().fromJson(strJsonStringFromFile2, Sticker.VideoFileConfig.class);
                                    if (videoFileConfig != null) {
                                        sticker5.setVideoFileConfig(videoFileConfig);
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        } else {
                            MDLog.m7443d(MaskStore.class.getSimpleName(), "video_file类型但没有config.json文件.");
                        }
                    }
                }
                if (maskModel.getEffectList() != null) {
                    Iterator<EffectFilterItem> it2 = maskModel.getEffectList().iterator();
                    while (it2.hasNext()) {
                        it2.next().setImageFolderPath(str);
                    }
                }
                return maskModel;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public List<MaskModel> getMasks(Context context) {
        return getMasksByFolderName(context, "Mask");
    }

    public void setFolderPath(String str) {
        this.folderPath = str;
    }
}

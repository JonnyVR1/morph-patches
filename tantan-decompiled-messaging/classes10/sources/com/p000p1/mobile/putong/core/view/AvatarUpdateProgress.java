package com.p000p1.mobile.putong.core.view;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public enum AvatarUpdateProgress {
    IDLE("初始化状态", false, true),
    PICK("选择照片中", false, true),
    CROP("裁剪照片", false, true),
    FINISH_CROP("裁剪照片完成", false, true),
    FINISH_PICK("选择照完成", true, true),
    BEFORE_CHECKING("上传前检测", true, true),
    BEFORE_DONE("上传前检测完成", true, true),
    UPLOADING("上传中", true, true),
    UPLOAD_DONE("上传成功", true, true),
    AFTER_CHECKING("上传后检测", true, true),
    AFTER_DONE("上传后检测完成", true, true),
    ADD_TAG("选择标签", true, true),
    ADD_TAG_FINISH("选择标签完成", true, true),
    FINISH("上传结束", false, true),
    FAIL("上传失败", false, false),
    CANCEL("上传取消", false, true);

    String desc;
    boolean isLoading;
    boolean isSuccess;

    AvatarUpdateProgress(String str, boolean z, boolean z2) {
        this.desc = str;
        this.isLoading = z;
        this.isSuccess = z2;
    }

    public String getDesc() {
        return this.desc;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }
}

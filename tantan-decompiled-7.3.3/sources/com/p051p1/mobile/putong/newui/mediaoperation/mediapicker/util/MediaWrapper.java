package com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util;

import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p153l.ewi;
import p153l.jyb;
import p153l.vg60;

/* JADX INFO: loaded from: classes10.dex */
public class MediaWrapper implements Serializable {
    public float imageCropProportion;
    public int imageCropWidth;
    public ewi selectedFolder;
    public String selectedFolderPath;
    public Map<String, C13229a> croppedMap = new HashMap();
    public final ArrayList<Media> allSelectedMedias = new ArrayList<>();
    public final ArrayList<Media> selectedVideoMedias = new ArrayList<>();
    public final ArrayList<Media> selectedImageMedias = new ArrayList<>();
    public vg60<Media> allMediasInPhoto = vg60.m201220b();

    /* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper$a */
    public static class C13229a {

        /* JADX INFO: renamed from: a */
        public String f54898a;

        /* JADX INFO: renamed from: b */
        public boolean f54899b;

        public C13229a(String str, boolean z) {
            this.f54898a = str;
            this.f54899b = z;
        }

        /* JADX INFO: renamed from: a */
        public String m80197a() {
            return this.f54898a;
        }
    }

    public void addAllSelectedMedia(List<Media> list) {
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            addSelectedMedia(it.next());
        }
    }

    public void addSelectedImage(Media media) {
        this.selectedImageMedias.add(media);
        this.allSelectedMedias.add(media);
    }

    public void addSelectedMedia(Media media) {
        if (media instanceof Video) {
            addSelectedVideo(media);
        } else if (media instanceof Picture) {
            addSelectedImage(media);
        }
    }

    public void addSelectedVideo(Media media) {
        this.selectedVideoMedias.add(media);
        this.allSelectedMedias.add(media);
    }

    public void clearAllSelectedMedia() {
        this.allSelectedMedias.clear();
        clearSelectedImage();
        clearSelectedVideo();
    }

    public void clearSelectedImage() {
        this.allSelectedMedias.removeAll(this.selectedImageMedias);
        this.selectedImageMedias.clear();
    }

    public void clearSelectedVideo() {
        this.allSelectedMedias.removeAll(this.selectedVideoMedias);
        this.selectedVideoMedias.clear();
    }

    public boolean containsInMedias(Media media, List<Media> list) {
        return indexOfMedias(media, list) >= 0;
    }

    public int getCurrentCount() {
        return Math.max(this.selectedVideoMedias.size(), this.selectedImageMedias.size());
    }

    public int getCurrentMaxCount(MediaPickerParamsObject mediaPickerParamsObject) {
        if (isVideoSelected()) {
            return mediaPickerParamsObject.getMaxVideoSelectCount();
        }
        if (isImageSelected()) {
            return mediaPickerParamsObject.getMaxImageSelectCount();
        }
        return -1;
    }

    public Media getFirstMedia() {
        if (this.allSelectedMedias.isEmpty()) {
            return null;
        }
        return this.allSelectedMedias.get(0);
    }

    public Picture getSelectedImage() {
        if (this.selectedImageMedias.isEmpty()) {
            return null;
        }
        return (Picture) this.selectedImageMedias.get(0);
    }

    public Media getSelectedVideo() {
        if (this.selectedVideoMedias.isEmpty()) {
            return null;
        }
        return this.selectedVideoMedias.get(0);
    }

    public int indexOfMedias(Media media, List<Media> list) {
        for (int i = 0; i < list.size(); i++) {
            if (isSameMedia(media, list.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public boolean isImageSelected() {
        return !jyb.m147479J(this.allSelectedMedias) && (this.allSelectedMedias.get(0) instanceof Picture);
    }

    public boolean isSameMedia(Media media, Media media2) {
        return media.url.equalsIgnoreCase(media2.url) || media.url.equalsIgnoreCase(media2.originUrl);
    }

    public boolean isVideoSelected() {
        return getSelectedVideo() != null;
    }

    public void removeMediaInList(Media media, List<Media> list) {
        int iIndexOfMedias = indexOfMedias(media, list);
        if (iIndexOfMedias >= 0) {
            list.remove(iIndexOfMedias);
        }
    }

    public void reset() {
        this.croppedMap.clear();
        clearAllSelectedMedia();
    }

    public boolean selectedIsImage() {
        return getFirstMedia() instanceof Picture;
    }

    public boolean selectedIsVideo() {
        return getFirstMedia() instanceof Video;
    }

    public void setSelectedFolder(ewi ewiVar) {
        this.selectedFolder = ewiVar;
        if (ewiVar != null) {
            this.selectedFolderPath = ewiVar.f96162b;
        } else {
            this.selectedFolderPath = null;
        }
    }

    public void unCheckMedia(Media media) {
        if (media instanceof Video) {
            removeMediaInList(media, this.selectedVideoMedias);
        } else {
            removeMediaInList(media, this.selectedImageMedias);
        }
        removeMediaInList(media, this.allSelectedMedias);
    }
}

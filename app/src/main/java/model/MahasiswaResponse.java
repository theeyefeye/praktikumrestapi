package model;

import java.util.List;

public class MahasiswaResponse{
    @SerializedName("data")
    private List<Mahasiswa> data;
    @SerializedName("status")
    private boolean status;
    public List<Mahasiswa> getData(){
        return data;
    }
    public boolean isStatus(){
        return status;
    }
}


package quanlinhasach;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class sachdaotask2 {
    private static final String SACH_FILE_NAME = "Sach.txt";
    public void write(List<Sach> sachList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(SACH_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(sachList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);
        }
    }
    public List<Sach> read() {
        List<Sach> sachList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(SACH_FILE_NAME));
            ois = new ObjectInputStream(fis);
            sachList = (List<Sach>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fis);
            closeStream(ois);
        }
        return sachList;
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
